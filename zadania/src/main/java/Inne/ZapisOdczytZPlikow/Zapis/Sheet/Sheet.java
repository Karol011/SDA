package Inne.ZapisOdczytZPlikow.Zapis.Sheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sheet {

    static void askQuestions() throws FileNotFoundException {
        String questionName = "What is your name?";
        String questionAge = "What is your age?";
        String questionHeight = "What is your height?";
        String questionSex = "What is your sex? male/female";
        String questionSalary = "How much do you earn?";
        String questionSmoker = "Do you smoke?";
        String questionDriverLicense = "Do you have a drivers license";
        String userAnswer = "";
        List<String> listOfQuestions = new ArrayList<>(Arrays.asList(
                questionName,questionAge, questionDriverLicense, questionHeight, questionSex, questionSalary, questionSmoker
        )
        );

        Scanner scanner = new Scanner(System.in);

        File sheet = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\Sheet\\output_form.txt");
        PrintWriter printWriter = new PrintWriter(sheet);

        for (String question : listOfQuestions) {
            System.out.println(question);
            printWriter.println();
            printWriter.append(question);
            printWriter.println();
            userAnswer = scanner.nextLine();
            printWriter.append(userAnswer);
        }
        printWriter.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        askQuestions();
    }
}
