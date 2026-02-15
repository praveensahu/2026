package d2.creational;
interface Vehicle{
    void drive();
}

class Car implements  Vehicle{
    @Override
    public void drive() {

    }
}

class VehcicleFactory{
    public static Vehicle getVehicle(String type){

        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }
            return null;
    }
}
public class Factory {
}
