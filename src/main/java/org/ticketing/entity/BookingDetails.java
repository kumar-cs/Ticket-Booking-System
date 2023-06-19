package org.ticketing.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TBooking")
public class BookingDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "theaterName")
    private String theaterName;

    @Column(name = "movieName")
    private String movieName;

    @Column(name = "showDate")
    private String showDate;

    @Column(name = "showTime")
    private String showTime;

    @Column(name = "seats")
    private String seats;

    public BookingDetails(long id, String theaterName, String movieName, String showDate, String showTime, String seats) {
        this.id = id;
        this.theaterName = theaterName;
        this.movieName = movieName;
        this.showDate = showDate;
        this.showTime = showTime;
        this.seats = seats;
    }

    public BookingDetails() {
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "id=" + id +
                ", theaterName='" + theaterName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showDate='" + showDate + '\'' +
                ", showTime='" + showTime + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

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

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
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
}
