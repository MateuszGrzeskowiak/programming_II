package pl.sda.programmingII;

import jdk.jfr.DataAmount;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Student{
    private List<Double> oceny = new ArrayList<>();
    private String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(String numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;

    }
}
