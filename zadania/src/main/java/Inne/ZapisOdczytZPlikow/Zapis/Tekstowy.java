package Inne.ZapisOdczytZPlikow.Zapis;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tekstowy  {
    public static void main(String[] args) throws FileNotFoundException {

            PrintWriter tekstowy = new PrintWriter("C:\\Users\\rudaz\\Desktop\\plik.txt");
            tekstowy.println("test zapisu");
            tekstowy.close();
        }
    }

