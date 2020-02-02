package Inne.ZapisOdczytZPlikow.Odczyt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Output_1 {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\Output\\output_1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        if (file.exists() && line.equals("Hello World!")) {
            System.out.println(line);
        } else {
            System.out.println("There is no such file or it contains something different than ' Hello World!'");
        }

    }
}
