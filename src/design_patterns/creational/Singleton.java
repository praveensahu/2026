package design_patterns.creational;

public class Singleton {
    private static  Singleton s;

    private Singleton(){
        if(s!=null){
            throw new RuntimeException("Reflection access detected");
        }
    }

    public static Singleton getSingleTon(){
        if(s==null){
            synchronized (Singleton.class){
                if(s==null){
                    s = new Singleton();
                }
            }
        }

        return s;
    }
}
