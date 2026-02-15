package dsa;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyExecutor {

    private BlockingQueue<Runnable> queue;
    private Thread[] threads;

    public MyExecutor(int size) {
        queue = new LinkedBlockingQueue<>();
        threads = new Thread[size];

        for (int i = 0; i < size; i++) {
            threads[i] = new Thread(new Worker(), "Thread-" + i);
            threads[i].start();
        }
    }

    public void submit(Runnable task) {
        queue.offer(task);
    }

    public void shutdown() {
        for (Thread t : threads) {
            t.interrupt();
        }
    }

    class Worker implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Runnable r = queue.take();
                    r.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
