package org.ticketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ticketing.dto.BookingRequestDTO;
import org.ticketing.dto.TheaterDetailsDTO;
import org.ticketing.dto.TicketDetailsDTO;
import org.ticketing.service.ITheaterSerachService;
import org.ticketing.service.ITicketBookingService;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/booking")
public class TicketBookingController {

    @Autowired
    ITicketBookingService ticketBookingService;

    @PostMapping("/bookmovie/")
    public List<TicketDetailsDTO> saveTicketDetails(@RequestBody BookingRequestDTO bookingRequest){

        return ticketBookingService.saveTicketDetails(bookingRequest);


    }
}
