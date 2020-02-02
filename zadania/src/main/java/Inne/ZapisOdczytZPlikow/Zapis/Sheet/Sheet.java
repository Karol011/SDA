package Inne.ZapisOdczytZPlikow.Zapis.Sheet;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sheet {

    private static void askQuestions() {
        String questionName = "What is your name?";
        String questionAge = "What is your age?";
        String questionHeight = "What is your height?";
        String questionSex = "What is your sex? male/female";
        String questionSalary = "How much do you earn?";
        String questionSmoker = "Do you smoke?";
        String questionDriverLicense = "Do you have a drivers license";
        String userAnswer;
        List<String> listOfQuestions = new ArrayList<>(Arrays.asList(
                questionSex, questionName, questionAge, questionDriverLicense, questionHeight, questionSalary, questionSmoker
        )
        );

        Scanner scanner = new Scanner(System.in);
        String doYouWanToContinuue = "";
        boolean isAWoman = false;
        File sheet = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\Sheet\\output_form.txt");
        try {

            FileWriter fileWriter = new FileWriter(sheet.getAbsoluteFile(), sheet.exists()); //Create file, if file exist append new questions
            while (!doYouWanToContinuue.equalsIgnoreCase("n")) {

                for (String question : listOfQuestions) {
                    System.out.println(question);
                    fileWriter.append("\n");
                    fileWriter.append(question);
                    fileWriter.append("\n");
                    userAnswer = scanner.nextLine();
                    if (userAnswer.equalsIgnoreCase("female")) {
                        isAWoman = true;
                    }
                    fileWriter.append(userAnswer);
                }
                if (isAWoman) {
                    System.out.println("Do you like wearing skirts?");
                    userAnswer = scanner.nextLine();
                    fileWriter.append(userAnswer);
                } else {
                    System.out.println("This supersecret question is only for males, answer whatever the f*** you like");
                    userAnswer = scanner.nextLine();
                    fileWriter.append(userAnswer);
                }
                System.out.println("Do you want to continue? y/n");
                doYouWanToContinuue = scanner.nextLine();
            }
            fileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        askQuestions();
    }
}
