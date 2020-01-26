package Inne.ZapisOdczytZPlikow.Zapis;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InformationsAboutFile {

    private static boolean checkIfPathToFileExists(String pathToFile) {
        File file = new File(pathToFile);
        return file.exists();
    }

    private static void printFileInfo(String pathToFile) {
        File file = new File(pathToFile);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        DateFormat format = new SimpleDateFormat("MMMM dd, yyyy HH:mm");

        if (checkIfPathToFileExists(pathToFile)) {
            if (file.isDirectory()) {
                System.out.println("This is a directory");
            } else {
                System.out.println("This is a file");
                System.out.printf("It's size: %,d", file.getTotalSpace());
                System.out.println();
            }
            System.out.println("Last modified " + format.format(file.lastModified()));

            if (file.canRead()) {
                System.out.println("You can read it");
            } else {
                System.out.println("You cannot read it");
            }

            if (file.canWrite()) {
                System.out.println("You can edit it");
            } else {
                System.out.println("You cannot edit it");
            }

        } else {
            System.out.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        System.out.println("type a path to file");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printFileInfo(input);
    }
    /*
    4. Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.
    Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,
    czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji i czy mamy prawa do odczytu/zapisu do tego pliku/katalogu.
     */
}
