package Inne.ZapisOdczytZPlikow.Odczyt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class Output2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\Output\\output_2.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        System.out.println(line.trim());



    }
}
