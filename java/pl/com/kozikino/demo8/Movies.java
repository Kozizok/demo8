package pl.com.kozikino.demo8;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String movie;

    private String duration;

    public Movies() {
    }

    public Movies(String movie, String duration) {
        this.setMovie(movie);
        this.setDuration(duration);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", movie='" + movie + "'" +
        ", duration=" + duration + "'" + "}";

    }
}

