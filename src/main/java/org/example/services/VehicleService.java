package org.example.services;

import org.example.models.Vehicle;
import org.example.models.VehicleType;
import org.example.repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle registerVehicle(String number, VehicleType type) {

        return vehicleRepository.addVehicle(new Vehicle(number,type));
    }

    public Vehicle getVehicle(String number) {
        return vehicleRepository.getVehicle(number);
    }

}
