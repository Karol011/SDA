package Inne.ZapisOdczytZPlikow.Zapis.Output;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Output_1 {

    public static void main(String[] args) throws FileNotFoundException {


        PrintWriter printWriter = new PrintWriter("C:\\Users\\rudaz\\javaRepozytoria4\\Zadania\\zadania\\src\\main\\java\\Inne" +
                "\\ZapisOdczytZPlikow\\Zapis\\output_1.txt");
        printWriter.println("Hello World!");
        printWriter.close();
    }
}
