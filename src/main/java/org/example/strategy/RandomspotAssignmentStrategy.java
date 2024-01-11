package org.example.strategy;

import org.example.models.Gate;
import org.example.models.ParkingSpot;
import org.example.models.ParkingSpotStatus;
import org.example.models.VehicleType;

import java.util.List;

public class RandomspotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(VehicleType type, Gate gate, List<ParkingSpot> parkingSpotList) {

        for(ParkingSpot parkingSpot : parkingSpotList){
            if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                    parkingSpot.getSupportedVehicleTypes().contains(type)){
                return parkingSpot;
            }
        }
        return null;
    }
}
