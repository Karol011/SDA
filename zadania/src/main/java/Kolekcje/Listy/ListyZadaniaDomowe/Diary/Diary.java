package Kolekcje.Listy.ListyZadaniaDomowe.Diary;

import lombok.Data;

import java.util.*;

@Data
class Diary {

    List<Student> listOfStudents;


    Diary(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    void addStudent(Student... student) {
        listOfStudents.addAll(Arrays.asList(student));
    }

    void removeStudent(Student... student) {
        listOfStudents.removeAll(Arrays.asList(student));
    }

    void removeStudent(String indexNumber) {
        for (Student s : listOfStudents) {
            if (s.getIndexNumber() == indexNumber) {
                listOfStudents.remove(s);
            }
        }
    }

    Student returnStudent(String indexNumber) throws NoSuchElementException {

        for (Student s : listOfStudents) {
            if (s.getIndexNumber() == indexNumber) {
                return s;
            } else {
                throw new NoSuchElementException("There is no student with that index number");
            }
        }
        return listOfStudents.get(0);
    }

    double averageGrades(String indexNumber) {
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

    List<Student> endangeredStudents() {
        List<Student> listOfEndangeredStudents = new ArrayList<>();
        for (Student student : listOfStudents) {
            if (averageGrades(student.getIndexNumber()) <= 3) {
                listOfEndangeredStudents.add(student);
            }
        }
        return listOfEndangeredStudents;
    }

    List<Student> sortStudentsAfterIndex() {
        List<Student> sortedDiaryOfStudends = listOfStudents;
       // Collections.copy(listOfStudents, sortedDiaryOfStudends);
        Collections.sort(sortedDiaryOfStudends,Student::compareTo);
        return sortedDiaryOfStudends;
    }
    //TODO
    /*

     */
}
