package org.ticketing.dto;

import java.util.List;
import java.util.Objects;

public class TheaterDetailsDTO {

    private String theaterName;
    private String movieName;
    private List<String> showTime;

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

    public List<String> getShowTime() {
        return showTime;
    }

    public void setShowTime(List<String> showTime) {
        this.showTime = showTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TheaterDetailsDTO that)) return false;
        return Objects.equals(getTheaterName(), that.getTheaterName()) && Objects.equals(getMovieName(), that.getMovieName()) && Objects.equals(getShowTime(), that.getShowTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheaterName(), getMovieName(), getShowTime());
    }

    @Override
    public String toString() {
        return "TheaterDetailsDTO{" +
                "theaterName='" + theaterName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showTime=" + showTime +
                '}';
    }
}
