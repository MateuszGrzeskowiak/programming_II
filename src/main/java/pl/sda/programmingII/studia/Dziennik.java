package pl.sda.programmingII.studia;

import java.util.*;
import java.util.stream.Collectors;

public class Dziennik {

    private List<Student> list = new ArrayList<>();

    public void dodajStudenta(Student s) {
        list.add(s);

    }

    public void usunStudenta(Student s) {
        list.remove(s);

    }

    public void usunStudentaPoNumerze(String indeks) {
        for (Student student : list) {
            if (student.getNumerIndeksu().equalsIgnoreCase(indeks)) {
                list.remove(student);
                break;
            }
        }
    }

    public Optional<Student> zwrocStudenta(String indeks) {
        for (Student student : list) {
            if (student.getNumerIndeksu().equalsIgnoreCase(indeks)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> podajSredniaStudenta(String indeks) {
        Optional<Student> studentOptional = zwrocStudenta(indeks);
        if (studentOptional.isPresent()) {
            Student st = studentOptional.get();

            return Optional.of(st.obliczSrednia());
        }
        return Optional.empty();
    }

    public List<Student> zwrocStudentowZagrozonych() {
        return list.stream()
                .filter(student -> student.obliczSrednia() <= 2.5)
                .collect(Collectors.toList());
    }

    public List<Student> posortujStudentow() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                Long s1 = Long.parseLong(student1.getNumerIndeksu());
                Long s2 = Long.parseLong(student2.getNumerIndeksu());

                return s1.compareTo(s2);  //-1  0  1
            }
        });
        return list;
    }

    public void dodajOcene(String indeks, Double ocena) {
        Optional<Student> studentOptional = zwrocStudenta(indeks);
        if (studentOptional.isPresent()) {
            Student st = studentOptional.get();

            st.getOceny().add(ocena);
        }
        throw new RuntimeException("Nie udalo sie znalzc studenta!");


    }
}
