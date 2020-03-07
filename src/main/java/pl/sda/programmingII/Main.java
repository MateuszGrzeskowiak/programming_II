package pl.sda.programmingII;

public class Main
{
    public static void main( String[] args ){

        Student s1 = new Student("1", "a", "z");
        Student s2 = new Student("2", "b", "y");
        Student s3 = new Student("3", "c", "x");
        Student s4 = new Student("4", "d", "w");
        Student s5 = new Student("5", "e", "v");

        Dziennik d = new Dziennik();
        d.dodajStudenta(s1);
        d.dodajStudenta(s2);
        d.dodajStudenta(s3);
        d.dodajStudenta(s4);
        d.dodajStudenta(s5);
        d.usunStudentaPoNumerze("2");
        d.usunStudentaPoNumerze("3");
    }


}
