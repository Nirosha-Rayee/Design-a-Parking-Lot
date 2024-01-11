package org.example.strategy;

import org.example.models.Gate;
import org.example.models.ParkingSpot;
import org.example.models.VehicleType;

import java.util.List;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType type, Gate gate, List<ParkingSpot> parkingSpotList);

}
