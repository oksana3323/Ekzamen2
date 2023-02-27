import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Binodel {
    private String name;
    private String trademark;
    private String country;
    private LocalDate dateSpill;
    private String note;

    //Методы установки значений.

    public Binodel(String name, String trademark, String country, LocalDate dateSpill, String note) {
        this.name = name;
        this.trademark = trademark;
        this.country = country;
        this.dateSpill = dateSpill;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateSpill() {
        return dateSpill;
    }

    public void setDateSpill(LocalDate dateSpill) {
        this.dateSpill = dateSpill;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Binodel{" +
                "name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                ", country='" + country + '\'' +
                ", dateSpill=" + dateSpill +
                ", note='" + note + '\'' +
                '}';
    }
}

