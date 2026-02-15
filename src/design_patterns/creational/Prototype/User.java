package design_patterns.creational.Prototype;

public class User implements  P{
    private  String name;
    private int sal;

    public  User(String name,int sal){
        this.name = name;
        this.sal = sal;

    }

    public User (User u){
        this.name = u.name;
        this.sal = u.sal;
    }

    @Override
    public P clone() {
        return new User(this);
    }

    public static void main(String[] args) {

        P p = new User("dsfd",1);
        User u = (User) p.clone();
        System.out.println(u.name);
    }
}
