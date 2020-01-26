package Inne.ZapisOdczytZPlikow.Zapis.Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Output_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\output_2.txt");

        System.out.println("Say something");
        String userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();

        PrintWriter output_2 = new PrintWriter(file);
        output_2.append(userInput);
        output_2.close();


    }
}
