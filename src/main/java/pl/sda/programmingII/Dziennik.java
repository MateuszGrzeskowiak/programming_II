package pl.sda.programmingII;

import java.util.ArrayList;
import java.util.List;

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


}
