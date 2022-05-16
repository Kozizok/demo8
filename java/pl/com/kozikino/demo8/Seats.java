package pl.com.kozikino.demo8;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seats {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer seatsRow;
    private Integer seatColumn;
    private Avaible avaible;

    public Seats(Integer id, Integer seatsRow, Integer seatColumn, Avaible avaible) {
        this.id = id;
        this.seatsRow = seatsRow;
        this.seatColumn = seatColumn;
        this.avaible = avaible;
    }

    public Seats() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatsRow() {
        return seatsRow;
    }

    public void setSeatsRow(Integer seatsRow) {
        this.seatsRow = seatsRow;
    }

    public Integer getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(Integer seatColumn) {
        this.seatColumn = seatColumn;
    }

    public Avaible getAvaible() {
        return avaible;
    }

    public void setAvaible(Avaible avaible) {
        this.avaible = avaible;
    }


    @Override
    public String toString() {
        return "Seats{" +
                "id=" + id +
                ", seatsRow=" + seatsRow +
                ", seatColumn=" + seatColumn +
                ", avaible='" + avaible + '\'' +
                '}';
    }
}
