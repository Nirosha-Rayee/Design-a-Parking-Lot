package org.example.services;

import org.example.exception.NoParkingSpotFoundException;
import org.example.models.*;
import org.example.repository.TicketRepository;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private ParkingSpotService parkingSpotService;
    private TicketRepository ticketRepository;
    private ParkingLotService parkingLotService;

    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType,Long gateId) throws NoParkingSpotFoundException {

        //Flow:
        //1.get vehicle from DB using vehicleNumber
        //2.if vehicle is not present in DB then register the vehicle

        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber); //1

        if(vehicle == null){
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType); // 2
        }

        Gate gate = gateService.getGate(gateId);

        //3. get the parking spot from gate and assign ParkingSpot to vehicle

        ParkingSpot parkingSpot = parkingLotService.getParkingSpot(vehicle, gate);
        if(parkingSpot == null){
            throw new NoParkingSpotFoundException("No Parking Spot Found");
        }

        //4. update the parking spot in as occupied in DB and return the ticket to user with parking spot details

        parkingSpot = parkingSpotService.assignParkingSpot(parkingSpot);

        //5.Generate ticket and return to user

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());

        //6. save the ticket in DB

        ticketRepository.save(ticket);

        return ticket;


    }
}
