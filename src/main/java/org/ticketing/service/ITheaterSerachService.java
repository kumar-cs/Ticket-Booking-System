package org.ticketing.service;

import org.ticketing.dto.TheaterDetailsDTO;

import java.util.List;

public interface ITheaterSerachService {

    List<TheaterDetailsDTO> getTheaterDetails(String searchShowDate);
}
