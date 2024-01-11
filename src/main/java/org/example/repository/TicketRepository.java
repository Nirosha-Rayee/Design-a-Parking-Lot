package org.example.repository;

import org.example.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long,Ticket> tickectStore;

    public TicketRepository(){
        this.tickectStore = new HashMap<>();
    }

    public void save(Ticket ticket){
        tickectStore.put(ticket.getId(),ticket);
    }

}
