package org.ticketing.dto;

import java.util.Objects;

public class BookingRequestDTO {
    private String theaterName;
    private String movieName;

    private String showTime;
    private String seats;
    private String showDate;
    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookingRequestDTO that)) return false;
        return Objects.equals(getTheaterName(), that.getTheaterName()) && Objects.equals(getMovieName(), that.getMovieName()) && Objects.equals(getShowTime(), that.getShowTime()) && Objects.equals(getSeats(), that.getSeats()) && Objects.equals(getShowDate(), that.getShowDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheaterName(), getMovieName(), getShowTime(), getSeats(), getShowDate());
    }
}
