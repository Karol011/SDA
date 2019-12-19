package Kolekcje.ListyZadaniaDomowe.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {
    String indexNumber;
    String name;
    String surname;
    Sex sex;

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber='" + indexNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                '}';
    }
}
