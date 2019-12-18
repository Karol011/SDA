package Kolekcje.ListyKolekcje.Diary;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Diary {


        List<Student> listOfStudents = new ArrayList<>();



    public static void addStudent(){
        Student student = new Student(Student.askAboutGrades(), Student.askAboutIndexNumber(), Student.askAboutName(), Student.askAboutSurname());
    }
}
