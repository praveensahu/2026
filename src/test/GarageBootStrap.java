package test;

import test.garage.Garage;
import test.vehicle.Car;
import test.vehicle.ElectricCar;
import test.vehicle.IVehicle.Vehicle;
import test.vehicle.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GarageBootStrap {

    public static void main(String[] args) {
      Garage g = instantitateVehicles();
        System.out.println("Number of vehicles: "+g.getVehiclesList().size());
       int numberOfElectricCars = (int) g.getVehiclesList().stream().filter(e -> e instanceof ElectricCar).count();
        System.out.println("numberOfElectricCars: "+numberOfElectricCars);
    }

    /**
     * TODO:make it dynamic to accept requests
     *     use abstract factory pattern
     */
    public static Garage instantitateVehicles(){
        Vehicle car2 = new Car(800,"blue");
        Vehicle car1 = new Car(700,"red");
        Vehicle car3 = new Car(900,"green");
        Vehicle car4 = new Car(1200,"orange");

        Vehicle truck1 = new Truck(1200,10000);
        Vehicle truck2 = new Truck(1300,11000);
        Vehicle truck3 = new Truck(1100,12000);
        Vehicle truck4 = new Truck(900,1300);

        Vehicle electricCar1 = new ElectricCar(900,"red",1300);
        Vehicle electricCar2 = new ElectricCar(1000,"orange",1300);
        Vehicle electricCar3 = new ElectricCar(1200,"green",1300);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);

        vehicles.add(truck1);
        vehicles.add(truck2);
        vehicles.add(truck3);
        vehicles.add(truck4);

        vehicles.add(electricCar1);
        vehicles.add(electricCar2);
        vehicles.add(electricCar3);
        Garage g = new Garage();
        g.setVehiclesList(vehicles);

        return g;
    }
}
