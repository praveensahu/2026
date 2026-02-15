package design_patterns.creational;

interface Vehicle {
    boolean drive();
}

class Car implements Vehicle {
    public boolean drive() {
        System.out.println("car");
        return false;
    }
}

class Bike implements Vehicle {
    public boolean drive() {
        System.out.println("bike");
        return false;
    }
}

 class Get {
    public Vehicle drive(String type) {
       if(type.equalsIgnoreCase("car")){
           return new Car();
       }
        if(type.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return null;
    }
}

public class Factory{
    public static void main(String[] args) {
        Car c = (Car)new Get().drive("car");
        System.out.println(c.drive());
    }
}
