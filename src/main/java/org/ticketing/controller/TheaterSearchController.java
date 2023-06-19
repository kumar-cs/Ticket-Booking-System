package org.ticketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ticketing.dto.TheaterDetailsDTO;
import org.ticketing.service.ITheaterSerachService;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/search")
public class TheaterSearchController{

    @Autowired
    ITheaterSerachService theaterSerachService;

    @GetMapping("/theaterDetails/{showDate}")
    public List<TheaterDetailsDTO> getTheaterDetails(@PathVariable String showDate){

        return theaterSerachService.getTheaterDetails(showDate);


    }
}