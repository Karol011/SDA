package Kolekcje.ListyKolekcje.Diary;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
@Data
public class Student {
    List<Double> grades = new ArrayList<>();
    String indexNumber;
    String name;
    String surname;

    public  static String askAboutName() {
        System.out.println("Type the name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while
        (!(name.matches("[a-zA-Z]+"))) {
            System.out.println("incorrect name, try again");
            name = scanner.nextLine();
        }
        System.out.println("Name seems good");
        return name;
    }

    public static String askAboutSurname() {
        System.out.println("Type the surname");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        while (!(surname.matches("[a-zA-Z]+"))) {
            System.out.println("incorrect surname, try again");
            surname = scanner.nextLine();
        }
        System.out.println("surname seems good");
        return surname;
    }

    public static String askAboutIndexNumber() {
        System.out.println("Type the index number (6 digits!)");
        Scanner scanner = new Scanner(System.in);
        String indexNumber = scanner.nextLine();
        while (!indexNumber.matches("\\d{6}")) {
            System.out.println("incorrect index number, try again");
            indexNumber = scanner.nextLine();
        }
        System.out.println("index seems good");
        return indexNumber;
    }

    public static List<Double> askAboutGrades() {
        System.out.println("Type the grades,separated by comma (\",\")");//todo check if works and set limiter from 2 to 5.5
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] arrayOfGrades = input.split(",");
        List<String> listOfGrades = new ArrayList<>(Arrays.asList(arrayOfGrades));
        List<Double> listOfGradesDouble = new ArrayList<>();
        String temp;
        for (int i = 0; i < listOfGrades.size(); i++) {
            temp = listOfGrades.get(i);
            listOfGradesDouble.add(Double.parseDouble(temp));
        }
        return listOfGradesDouble;
    }
}
