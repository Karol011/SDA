package Kolekcje.MapyZadaniaDomowe.AttendanceList;

import java.util.*;

/*
• Zadanie 6.3 Napisz program wykorzystujący Mapę do przechowywania
listy obecności (pary "imię nazwisko" / liczba obecności)
• Dodawanie osoby poprzez podanie imienia i nazwiska
• Usuwanie osoby poprzez podanie imienia i nazwiska
• Wypisanie całej listy obecności
• Wypisanie wszystkich osób które mają zadaną liczbę obecności
• Dodanie/odjęcie obecności osobie o wpisanym imieniu i nazwisku
• *Dodanie obecności wszystkim
• *Wypisywanie osób które mają więcej/mniej obecności niż wpisana
liczba
 */
public class AttendanceList {
    public static void main(String[] args) {
        Map<String, Integer> attendanceList = new HashMap<>();
        attendanceList.put("Karol", 5);
        attendanceList.put("Dominika", 9);
        attendanceList.put("Sylwia", 3);
        attendanceList.put("Sławek", 2);
        attendanceList.put("Pioter", 3);

        //   attendanceList.forEach((string,value)-> System.out.println(string+value));

       /* for (Map.Entry element : attendanceList.entrySet()) { // .entryset jest para key:value
            element.setValue((int) element.getValue() + 100);
            System.out.println(element);
        }*/
        addPerson(attendanceList, "Pioterskyy");
        System.out.println(attendanceList);
        removePerson(attendanceList, "Pioterskyy");
        removePerson(attendanceList, "Pioterskyy");
        System.out.println(attendanceList);
        showStudentsWithSpecificAttendance(attendanceList, 3);
        showStudentsWithSpecificAttendance(attendanceList, 23);
        removeAttendance(attendanceList, "Sławek");
        System.out.println(attendanceList);
        addAttendance(attendanceList, "Karol");
        System.out.println(attendanceList);
        addAttendanceAll(attendanceList);
        System.out.println(attendanceList);
        showStudentsWthAttendanceLesserThan(attendanceList, 10);
        showStudentsWthAttendanceBiggerThan(attendanceList, 3);
    }

    static void addPerson(Map<String, Integer> attendanceList, String name) {
        Random random = new Random();
        int attendance = random.nextInt(10);
        attendanceList.put(name, attendance);
    }

    static void removePerson(Map<String, Integer> attendanceList, String name) {
        boolean removed = false;
        for (String student : attendanceList.keySet()) {
            if (student.equalsIgnoreCase(name)) {
                attendanceList.keySet().remove(name);
                removed = true;
                System.out.println("Succesfully removed student: " + name);
                break;
            }
        }
        if (!removed) {
            System.out.println("Removing failed, no such student...");
        }
    }

    static void showStudentsWithSpecificAttendance(Map<String, Integer> attendanceList, int number) {
        boolean foundSome = false;
        for (Map.Entry student : attendanceList.entrySet()) {
            if ((int) student.getValue() == number) {
                System.out.println(student);
                foundSome = true;
            }
        }
        if (!foundSome) {
            System.out.println("no students with such attendance, sorry");
        }
    }

    static void removeAttendance(Map<String, Integer> attendanceList, String name) {
        boolean removed = false;
        for (Map.Entry student : attendanceList.entrySet()) {
            if (student.getKey().equals(name)) {
                student.setValue((int) student.getValue() - 1);
                removed = true;
                System.out.println("Succesfully removed attendance for student: " + name);
                break;
            }
        }
        if (!removed) {
            System.out.println("Removing attendance failed, no such student...");
        }
    }

    static void addAttendance(Map<String, Integer> attendanceList, String name) {
        boolean removed = false;
        for (Map.Entry student : attendanceList.entrySet()) {
            if (student.getKey().equals(name)) {
                student.setValue((int) student.getValue() + 1);
                removed = true;
                System.out.println("Succesfully removed attendance for student: " + name);
                break;
            }
        }
        if (!removed) {
            System.out.println("Removing attendance failed, no such student...");
        }
    }

    static void addAttendanceAll(Map<String, Integer> attendanceList) {
        for (Map.Entry student : attendanceList.entrySet()) {
            student.setValue((int) student.getValue() + 1);
        }
    }

    static void showStudentsWthAttendanceLesserThan(Map<String, Integer> attendanceList, int number) {
        for (Map.Entry student : attendanceList.entrySet()) {
            if ((int) student.getValue() < number) {
                System.out.println(student);
            }
        }
    }

    static void showStudentsWthAttendanceBiggerThan(Map<String, Integer> attendanceList, int number) {
        for (Map.Entry student : attendanceList.entrySet()) {
            if ((int) student.getValue() > number) {
                System.out.println(student);
            }
        }
    }
}
