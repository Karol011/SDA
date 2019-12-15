package Grudzien14.ZapisOdczytZPlikow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WynikiMeczow {
    public static void main(String[] args) throws FileNotFoundException {
        //zapiszDoPliku();
        // wczytajLinieZPliku();
        System.out.println(wczytajLinieZPlikuIZapiszDoListy());
    }

    static void wczytajLinieZPliku() throws FileNotFoundException {
        File plik = new File("C:\\Users\\rudaz\\Desktop\\wynikiMeczow.txt");
        Scanner scanner = new Scanner(plik);
        System.out.println(scanner.nextLine());
    }

    static List<String> wczytajLinieZPlikuIZapiszDoListy() throws FileNotFoundException {
        File plik = new File("C:\\Users\\rudaz\\Desktop\\wynikiMeczow.txt");
        Scanner scanner = new Scanner(plik);
        List<String> lista = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lista.add(scanner.nextLine().trim() + "\n");
        }
        return lista;
    }

    static void zapiszDoPliku() throws FileNotFoundException {
        PrintWriter wynikuMeczow = new PrintWriter("C:\\Users\\rudaz\\Desktop\\wynikiMeczow.txt");
        wynikuMeczow.append(pobierzWyniki());
        wynikuMeczow.close();
    }


    static String pobierzWyniki() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 1 druzyne");
        String druzyna1 = scanner.nextLine();
        System.out.println("podaj ilosc bramek ");
        int bramki1 = scanner.nextInt();
        System.out.println("podaj 2 druzyne");
        String druzyna2 = scanner.nextLine();
        druzyna2 = scanner.nextLine();
        System.out.println("podaj ilosc bramek ");
        int bramki2 = scanner.nextInt();
        if (bramki1 == bramki2) {
            System.out.println("podaj ilosc strzelonych karnych druzyny 1");
            int karne1 = scanner.nextInt();
            System.out.println("podaj ilosc strzelonych karnych druzyny 2");
            int karne2 = scanner.nextInt();
            if (karne1 > karne2) {
                return druzyna1 + "<" + bramki1 + ">(" + karne1 + "):" + druzyna2 + "<" + bramki2 + ">(" + karne2 + ")";
            } else {
                return druzyna2 + "<" + bramki2 + ">(" + karne2 + "):" + druzyna1 + "<" + bramki1 + ">(" + karne1 + ")";

            }
        }
        if (bramki1 > bramki2) {
            return druzyna1 + "<" + bramki1 + ">:" + druzyna2 + "<" + bramki2 + ">";
        } else {
            return druzyna2 + "<" + bramki2 + ">:" + druzyna1 + "<" + bramki1 + ">";

        }
    }
}
