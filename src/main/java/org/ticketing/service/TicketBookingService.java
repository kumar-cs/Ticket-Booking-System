package org.ticketing.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ticketing.dto.BookingRequestDTO;
import org.ticketing.dto.TicketDetailsDTO;
import org.ticketing.entity.BookingDetails;
import org.ticketing.repository.ITicketBookingRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class TicketBookingService implements ITicketBookingService {

    @Autowired
    private ITicketBookingRepository iTicketBookingRepository;

    @Override
    public List<TicketDetailsDTO> saveTicketDetails(BookingRequestDTO bookingRequest) {


        BookingDetails bookingEntity = new BookingDetails();

        BeanUtils.copyProperties(bookingRequest,bookingEntity);

        BookingDetails savedValue=  iTicketBookingRepository.saveAndFlush(bookingEntity);

        TicketDetailsDTO response = new TicketDetailsDTO();

        response.setTicketNumber((int) savedValue.getId());

        response.setTicketDetails(bookingRequest);

      return List.of(response);
    }
}
