package Kolekcje.ListyZadaniaDomowe.Diary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Student s1 = new Student(Student.askAboutGrades(), Student.askAboutIndexNumber(), Student.askAboutName(), Student.askAboutSurname());
        Student s2 = new Student(new ArrayList<>(Arrays.asList(3.5, 4.0, 4.5)), "123224", "Marta", "Martynska");
        Student s3 = new Student(new ArrayList<>(Arrays.asList(3.5, 4.0, 1.0, 2.5, 4.5)), "435324", "Karol", "Karolksy");
        Student s4 = new Student(new ArrayList<>(Arrays.asList(3.5, 4.0, 1.0, 2.5, 4.0)), "093723", "roebert", "maklowicz");
        Student s5 = new Student(new ArrayList<>(Arrays.asList(3.5, 2.0, 1.0, 1.5, 2.0)), "665342", "slabiak", "gesler");

        List<Student> listOfStudents = new ArrayList<>();

        Diary studentsDiary = new Diary(listOfStudents);
        //System.out.println(listOfStudents.toString());
        listOfStudents.forEach(Student -> System.out.println(Student.toString()));
        studentsDiary.addStudent(s4, s2, s3, s5);
        System.out.println("sorted diary by index: "+studentsDiary.sortStudentsAfterIndex().toString());
        System.out.println("average grades of " + studentsDiary.averageGrades("435324"));
        System.out.println("Endangered students: "+ studentsDiary.endangeredStudents().toString());
        System.out.println(listOfStudents.toString());
        studentsDiary.removeStudent(s4,s2);
        System.out.println(listOfStudents.toString());
        studentsDiary.removeStudent("123224");
        System.out.println(listOfStudents.toString());
        studentsDiary.returnStudent("43324");

        studentsDiary.returnStudent("43724");


    }
}
