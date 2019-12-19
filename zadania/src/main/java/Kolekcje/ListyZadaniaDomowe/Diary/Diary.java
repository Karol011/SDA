package Kolekcje.ListyZadaniaDomowe.Diary;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
public class Diary {

    List<Student> listOfStudents;


    public Diary(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void addStudent(Student... student) {
        listOfStudents.addAll(Arrays.asList(student));
    }

    public void removeStudent(Student... student) {
        listOfStudents.removeAll(Arrays.asList(student));
    }

    public void removeStudent(String indexNumber) {
        for (Student s : listOfStudents) {
            if (s.getIndexNumber() == indexNumber) {
                listOfStudents.remove(s);
            }
        }
    }

    public Student returnStudent(String indexNumber) throws NoSuchElementException {

        for (Student s : listOfStudents) {
            if (s.getIndexNumber() == indexNumber) {
                return s;
            } else {
                throw new NoSuchElementException("There is no student with that index number");
            }
        }
        return listOfStudents.get(0);
    }

    public double averageGrades(String indexNumber) {
        double sum = 0.0;
        double numberOfGrades = 0.0;
        for (Student student : listOfStudents) {
            if (student.getIndexNumber().equalsIgnoreCase(indexNumber)) {
                for (Double grades : student.getGrades()) {
                    sum += grades;
                    numberOfGrades++;
                }
            }
        }
        return sum / numberOfGrades;
    }

    public List<Student> endangeredStudents() {
        List<Student> listOfEndangeredStudents = new ArrayList<>();
        for (Student student : listOfStudents) {
            if (averageGrades(student.getIndexNumber()) <= 3) {
                listOfEndangeredStudents.add(student);
            }
        }
        return listOfEndangeredStudents;
    }

    public List<Student> sortStudentsAfterIndex() {
        List<Student> sortedDiaryOfStudends = listOfStudents;
       // Collections.copy(listOfStudents, sortedDiaryOfStudends);
        Collections.sort(sortedDiaryOfStudends,Student::compareTo);
        return sortedDiaryOfStudends;
    }
    //TODO
    /*

     */
}
