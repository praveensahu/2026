package dsa;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MyTTLExecutor {

    private final DelayQueue<TimedTask> delayQueue;
    private final Thread[] workers;
    private volatile boolean running = true;

    public MyTTLExecutor(int poolSize) {
        this.delayQueue = new DelayQueue<>();
        this.workers = new Thread[poolSize];

        for (int i = 0; i < poolSize; i++) {
            workers[i] = new Thread(new Worker(), "TTL-Worker-" + i);
            workers[i].start();
        }
    }

    // Submit with TTL
    public void submit(Runnable task, long delay, TimeUnit unit) {
        delayQueue.offer(new TimedTask(task, delay, unit));
    }

    public void shutdown() {
        running = false;
        for (Thread t : workers) {
            t.interrupt();
        }
    }

    // -------------------------
    // Internal Timed Task
    // -------------------------
    private static class TimedTask implements Delayed {

        private final Runnable task;
        private final long triggerTime; // time when task becomes available

        TimedTask(Runnable task, long delay, TimeUnit unit) {
            this.task = task;
            this.triggerTime =
                    System.currentTimeMillis() + unit.toMillis(delay);
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long remaining =
                    triggerTime - System.currentTimeMillis();
            return unit.convert(remaining, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed other) {
            return Long.compare(
                    this.triggerTime,
                    ((TimedTask) other).triggerTime
            );
        }

        public void execute() {
            task.run();
        }
    }

    // -------------------------
    // Worker Thread
    // -------------------------
    private class Worker implements Runnable {

        @Override
        public void run() {
            while (running) {
                try {
                    // take() blocks until delay expires
                    TimedTask timedTask = delayQueue.take();
                    timedTask.execute();

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
