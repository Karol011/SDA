package listopad30.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pioter", "Piotersky", 3533);
        Student student2 = new Student("michal", "jakistam", 1234);
        Student student3 = new Student("olga", "costamowska", 1234);
        Student student4 = new Student("brajanek", "zaaostamowska", 1234);
        Student student5 = new Student("ajanuszek", "costamowska", 1234);

        Student[] studenci = {student1,student2,student3,student4,student5};

        wyswietlStudentow(studenci);
        System.out.println("posortowani: ");
        Arrays.sort(studenci);
        wyswietlStudentow(studenci);



    }


    public static void wyswietlStudentow(Student[] studenci) {
        for (int i = 0; i < studenci.length; i++) {
            System.out.println(studenci[i].toString());
        }
    }


}
