package d2.creational;

public class Singleton {

    private static Singleton s;
    private Singleton(){
        throw new RuntimeException("Reflection access detected");
    }

    public static Singleton getInstance(){
        if(s == null){
            synchronized (Singleton.class){
                if(s==null){
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
