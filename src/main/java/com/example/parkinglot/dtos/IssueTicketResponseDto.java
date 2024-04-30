package com.example.parkinglot.dtos;

import com.example.parkinglot.Models.Ticket;

public class IssueTicketResponseDto {
    private Ticket Ticket;
    private ResponseStatus ResponseStatus;

    public Ticket getTicket() {
        return Ticket;
    }

    public void setTicket(Ticket ticket) {
        this.Ticket = ticket;
    }


    public ResponseStatus getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.ResponseStatus = responseStatus;
    }
}
