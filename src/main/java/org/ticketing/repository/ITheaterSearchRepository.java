package org.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.ticketing.dto.TheaterDetailsDTO;
import org.ticketing.entity.TheaterDetails;

import java.util.List;

@Repository
public interface ITheaterSearchRepository extends JpaRepository<TheaterDetails ,Long> {

    List<TheaterDetails> findByShowDate(String showDate);
}
