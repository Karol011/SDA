package Inne.ZapisOdczytZPlikow.Zapis.Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Output_3 {

    static void readInputUntilUserSayQuit() throws FileNotFoundException {
        File output_3 = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\output_3.txt");
        PrintWriter printWriter = new PrintWriter(output_3);
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        System.out.println("Say something\n" +
                "type 'quit' - to close the program");

        while (!userInput.equalsIgnoreCase("quit")) {
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("quit")) {
                printWriter.append(userInput);
                printWriter.println();
            }
        }
        printWriter.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        readInputUntilUserSayQuit();

    }


}
