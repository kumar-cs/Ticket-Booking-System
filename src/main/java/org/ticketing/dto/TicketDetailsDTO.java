package org.ticketing.dto;

public class TicketDetailsDTO {

   private BookingRequestDTO ticketDetails;

    private Integer ticketNumber;

    public BookingRequestDTO getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(BookingRequestDTO ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
