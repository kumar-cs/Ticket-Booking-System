package org.ticketing.service;

import org.ticketing.dto.BookingRequestDTO;
import org.ticketing.dto.TicketDetailsDTO;

import java.util.List;

public interface ITicketBookingService {

    List<TicketDetailsDTO> saveTicketDetails(BookingRequestDTO bookingRequest);
}
