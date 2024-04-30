package com.example.parkinglot.services;

import com.example.parkinglot.exceptions.InvalidGateException;
import com.example.parkinglot.repositories.GateRepository;
import com.example.parkinglot.Models.Gate;
import com.example.parkinglot.Models.Ticket;
import com.example.parkinglot.Models.VehicleType;


import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}
