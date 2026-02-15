package test.vehicle;

public class ElectricCar  extends Car{

    private int batteryCapacity;

    public ElectricCar(int weight, String color,int batteryCapacity) {
        super(weight, color);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
