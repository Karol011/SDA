package Kolekcje.Listy.ListyZadaniaDomowe.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
5. Stwórz klasę Student która posiada pola:nr indeksuimienazwiskopłeć (wartość enum)W mainie stwórz instancję kolekcji typu ArrayList,
 która zawiera obiekty klasy Student.Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
 a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
 b. Spróbuj wypisać elementy stosując pętlę foreach
 c. Wypisz tylko kobiety
 d. Wypisz tylko mężczyzne. Wypisz tylko indeksy osób
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("123456", "Karol", "Karolsky", Sex.MAN);
        Student s2 = new Student("456345", "Karolina", "Janiak", Sex.WOMAN);
        Student s3 = new Student("983762", "Alina", "Wojak", Sex.WOMAN);
        Student s4 = new Student("736827", "Ola", "Kamilak", Sex.WOMAN);

        List<Student> listOfStudents = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
//display all
        System.out.println(listOfStudents.get(3));
        for (Student s :
                listOfStudents) {
            System.out.println(s);
        }
//woman only
        System.out.println("woman only");
        for (Student s : listOfStudents) {
            if (s.getSex().equals(Sex.WOMAN)) {
                System.out.println(s);
            }
        }
        //indexes only
        System.out.println("indexes only");
        for (Student s : listOfStudents) {

            System.out.println(s.getIndexNumber());

        }
    }


}
