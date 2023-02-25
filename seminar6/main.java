package seminar6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();



        Cat cat = new Cat("Барсик", "Сибирская", LocalDate.of(2006, 12, 6),
                "Людмила");

        cat.addVaccination(new Vaccinacion(LocalDate.now(), "бешенство"));
        cat.addVaccination(new Vaccinacion(LocalDate.of(2012, 5, 25), "комплекс"));
        cats.add(cat);

        Cat murzik = new Cat("Мурзин", "Персидск?", LocalDate.of(2011, 12, 6),"Людмила");
        murzik.addVaccination(new Vaccinacion(LocalDate.of(2012, 5, 25), "комплекс"));

        System.out.println(cat);
    }
}