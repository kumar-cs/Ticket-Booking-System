package org.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ticketing.entity.BookingDetails;

@Repository
public interface ITicketBookingRepository extends JpaRepository<BookingDetails,Long> {
}
