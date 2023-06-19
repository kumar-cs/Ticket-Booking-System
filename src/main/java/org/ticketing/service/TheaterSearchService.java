package org.ticketing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ticketing.dto.TheaterDetailsDTO;
import org.ticketing.entity.TheaterDetails;
import org.ticketing.repository.ITheaterSearchRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TheaterSearchService implements ITheaterSerachService {

    @Autowired
    ITheaterSearchRepository theaterSearchRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TheaterDetailsDTO> getTheaterDetails(String searchShowDate) {

        List<TheaterDetails> theaterDetailsList = new ArrayList<TheaterDetails>(theaterSearchRepository.findByShowDate(searchShowDate));


        List<TheaterDetailsDTO> theaterDetailsDTOS = new ArrayList<TheaterDetailsDTO>();
        TheaterDetailsDTO theaterDetailsDTO = new TheaterDetailsDTO();

        theaterDetailsList.forEach(
                theaterDetails ->
                {
                    theaterDetailsDTO.setTheaterName(theaterDetails.getTheaterName());
                    theaterDetailsDTO.setMovieName(theaterDetails.getMovieName());
                    theaterDetailsDTO.setShowTime(Arrays.asList(theaterDetails.getShowTime().split(",")));
                    theaterDetailsDTOS.add(theaterDetailsDTO);
                }

        );


        return theaterDetailsDTOS;
    }
}
