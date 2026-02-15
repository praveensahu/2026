package test.garage;

import test.vehicle.IVehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehiclesList = new ArrayList<>();

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void setVehiclesList(List<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

}
