package seminar6;
import java.time.LocalDate;

public class Vaccinacion {
    private LocalDate date;
    private String name;

    /*public Vaccination(LocalDate date, String name){
        this.date = date;
        this.name = name;
    }*/

    public Vaccinacion(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }
    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

}

