package Inne.Generyka.Pair;

public class Student {
    String name;
    String surname;
    double averageGrades;

    public Student(String name, String surname, double averageGrades) {
        this.name = name;
        this.surname = surname;
        this.averageGrades = averageGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageGrades=" + averageGrades +
                '}';
    }
}
