package pl.sda.programmingII.studia;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("1", "a", "z");
        Student s2 = new Student("2", "b", "y");
        Student s3 = new Student("3", "c", "x");
        Student s4 = new Student("4", "d", "w");
        Student s5 = new Student("6", "e", "v");
        Student s6 = new Student("5", "f", "u");

        Dziennik d = new Dziennik();
        d.dodajStudenta(s1);
        d.dodajStudenta(s2);
        d.dodajStudenta(s3);
        d.dodajStudenta(s4);
        d.dodajStudenta(s5);
        d.dodajStudenta(s6);
        d.usunStudentaPoNumerze("2");
        d.usunStudentaPoNumerze("3");

        Optional<Student> pudelko = d.zwrocStudenta("4");
        if (pudelko.isPresent()) {
            Student s = pudelko.get();
            System.out.println(s.getImie());
        }

        d.posortujStudentow().forEach(System.out::println);

        d.dodajOcene("4", 3.5);

    }
}
