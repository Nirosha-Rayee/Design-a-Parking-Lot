package org.example.repository;

import org.example.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    /* we can have Map as DB and use to push/ retrive data from it.

     * This is a repository class which will store the vehicle details in a map.
     * <p>
     * This class will have two methods:
     * <p>
     * addVehicle(Vehicle vehicle) : This method will add the vehicle to the map.
     * getVehicle(String number) : This method will return the vehicle from the map.
     */
    Map<String, Vehicle> vehicleStore;

    public VehicleRepository() {
        this.vehicleStore = new HashMap<>();
    }

    public Vehicle addVehicle(Vehicle vehicle) {

        vehicleStore.put(vehicle.getNumber(), vehicle);
        return vehicle;
    }

    public Vehicle getVehicle(String number) {
        return vehicleStore.get(number);
    }

}
