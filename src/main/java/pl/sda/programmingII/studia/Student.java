package pl.sda.programmingII.studia;

import jdk.jfr.DataAmount;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

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

    public Double obliczSrednia(){
        double suma = 0.0;

        //opcja 1
        for (int i = 0; i < oceny.size() ; i++) {
            suma+=oceny.get(i);
        }
        //opcja 2
        //suma = oceny.stream().mapToDouble(Double::doubleValue).sum();

        //opcja 3
        OptionalDouble srednia = oceny.stream().mapToDouble(Double::doubleValue).average();
        return srednia.orElse(0.0);
        //return suma / oceny.size();
    }
}
