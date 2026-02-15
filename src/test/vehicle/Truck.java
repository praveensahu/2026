package test.vehicle;

import test.vehicle.IVehicle.Vehicle;

public class Truck extends Vehicle {

    public int loadCapacity;
    public Truck(int weight,int loadCapacity){
        this.weight = weight;
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
