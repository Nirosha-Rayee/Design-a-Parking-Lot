package org.example.controller;

import org.example.dto.GenerateTicketRequestDto;
import org.example.dto.GenerateTicketResponseDto;
import org.example.dto.ResponseStatus;
import org.example.exception.NoParkingSpotFoundException;
import org.example.models.Ticket;
import org.example.services.TicketService;

public class TicketController {

    //DTO - Data Transfer Object
    //problems with directly involving Models in the Controller API's :-
    //1. If we add/remove models from the input, current clients will start failing.
    //2. We should not expose the Model details to client because of privacy.
    //The solution to this : Data Transfer Objects (DTO).
    //DTO is an object that carries data between processes.
    //DTOs are used to encapsulate the data that is sent between the client and the server.


 private TicketService ticketService;


    public TicketController(TicketService ticketService) {
    this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto){
        //1. get the vehicle number, vehicle type and gate id from the request
        //2. call the generateTicket method of ticketService and get the ticket
        //3. create a GenerateTicketResponseDto object and set the ticket and status
        //4. return the GenerateTicketResponseDto object

        try {
            Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getVehicleNumber(),
                    generateTicketRequestDto.getVehicleType(), generateTicketRequestDto.getGateId());

            GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
            generateTicketResponseDto.setTicket(ticket);
            generateTicketResponseDto.setStatus(ResponseStatus.SUCCESS);

            return generateTicketResponseDto;

        }catch (NoParkingSpotFoundException e){
            GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
            generateTicketResponseDto.setStatus(ResponseStatus.FAILURE);
            generateTicketResponseDto.setFailureMessage(e.getMessage());
            return generateTicketResponseDto;

        }catch (Exception e){
            GenerateTicketResponseDto generateTicketResponseDto = new GenerateTicketResponseDto();
            generateTicketResponseDto.setStatus(ResponseStatus.FAILURE);
            generateTicketResponseDto.setFailureMessage("Something went wrong");
            return generateTicketResponseDto;
        }

    }


}
