package org.example.services;

import org.example.models.Gate;
import org.example.models.ParkingSpot;
import org.example.models.Vehicle;
import org.example.repository.ParkingLotRepository;
import org.example.strategy.SpotAssignmentStrategy;

import java.util.List;

public class ParkingLotService {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }


    public ParkingSpot getParkingSpot(Vehicle vehicle, Gate gate) {
        List<ParkingSpot> parkingSpotList = parkingLotRepository.getAllParkingSpots();

        return spotAssignmentStrategy.assignSpot(vehicle.getVehicleType(),gate,parkingSpotList);
    }
}
