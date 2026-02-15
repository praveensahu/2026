package test.vehicle;

import test.vehicle.IVehicle.Vehicle;

public class Car  extends Vehicle {
    public String color;
    public Car(int weight,String color){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
}
