package org.ticketing.entity;


import jakarta.persistence.*;


import java.io.Serializable;


@Entity
@Table(name = "TDetails")
public class TheaterDetails  implements Serializable {

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

    public void setId(long id) {
        this.id = id;
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
    public TheaterDetails(){

    }

    public long getId() {
        return id;
    }
    public TheaterDetails(long Id, String theaterName, String movieName, String showDate, String showTime) {
        this.id=Id;
        this.theaterName = theaterName;
        this.movieName = movieName;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "TheaterDetails{" +
                "id=" + id +
                ", theaterName='" + theaterName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showDate='" + showDate + '\'' +
                ", showTime='" + showTime + '\'' +
                '}';
    }
}
