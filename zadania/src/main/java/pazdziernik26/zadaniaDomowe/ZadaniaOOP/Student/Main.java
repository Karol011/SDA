package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.ZadaniaOOP.Student;

public class Main {
    public static void main(String[] args) {
createStudent();

         Student karol = new Student(666777, "Karol", "Placek", 'm');
        Student karolina = new Student(113, "Karolina", "Pigwa", 'k');
        Student Ania = new Student(456, "Ania", "Zamek", 'k');
    }
    public static void createStudent() {
        Student student = new Student(Student.askAboutIndexNumber(), Student.askAboutName(), Student.askAboutSurname(), Student.askAboutSex());
        Student.introduceYourself(student.name, student.surname, student.indexNumber, student.sex);
    }
}
