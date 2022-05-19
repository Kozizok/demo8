package pl.com.kozikino.demo8;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String sessionDate;
    private Integer movies_id;

    public Session(Integer id) {
        this.id = id;
    }

    public Session() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Integer getMovies_id() {
        return movies_id;
    }

    public void setMovies_id(Integer movies_id) {
        this.movies_id = movies_id;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", sessionDate='" + sessionDate + '\'' +
                ", movies_id=" + movies_id +
                '}';
    }
}
