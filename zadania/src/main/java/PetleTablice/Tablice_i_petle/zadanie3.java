package PetleTablice.Tablice_i_petle;

import java.util.Scanner;

/*
3. Napisz program, który zwraca w postaci tablicy zbiór wszystkich liczb mniejszych od zadanej przez użytkownika liczby oraz:
a. Podzielnych przez 2
b. Podzielnych przez 3
c. *Podzielnych przez zadaną przez użytkownika liczbę
 */
public class zadanie3 {
    public static void main(String[] args) {
        System.out.println();
          wybierzDzialanie();
    }

    private static int wczytajLiczbe() {
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int wczytanaLiczba = scan.nextInt();
        return wczytanaLiczba;
    }

    private static int wczytajDzielnik() {
        System.out.println("Podaj dzielnik");
        Scanner scan = new Scanner(System.in);
        int wczytanyDzielnik = scan.nextInt();
        return wczytanyDzielnik;
    }

    public static int[] wypiszLiczby(int liczbaPodanaPrzezUzytkownika) {
        int[] array = new int[liczbaPodanaPrzezUzytkownika];
        System.out.println("oto wszystkie liczby mniejsze od " + liczbaPodanaPrzezUzytkownika);
        for (int i = liczbaPodanaPrzezUzytkownika - 1; i > 0; i--) {
            array[i] = i;
            System.out.print(array[i] + ",");
            if (i == 50) {
                System.out.println();
            }
        }
        System.out.println();
        return array;
    }

    public static void wypiszPodzielnePrzez2(int[] liczbyMniejszeOdPodanejPrzezUzytkownika) {
        System.out.println("oto liczby mniejsze i podzielne przez 2 ");
        for (int i = 1; i < liczbyMniejszeOdPodanejPrzezUzytkownika.length; i++) {
            if (liczbyMniejszeOdPodanejPrzezUzytkownika[i] % 2 == 0) {
                System.out.print(liczbyMniejszeOdPodanejPrzezUzytkownika[i] + ",");
            }
        }
        System.out.println();
    }

    public static void wypiszPodzielnePrzez3(int[] liczbyMniejszeOdPodanejPrzezUzytkownika) {
        System.out.println("oto liczby mniejsze i podzielne przez 3 ");
        for (int i = 1; i < liczbyMniejszeOdPodanejPrzezUzytkownika.length; i++) {
            if (liczbyMniejszeOdPodanejPrzezUzytkownika[i] % 3 == 0) {
                System.out.print(liczbyMniejszeOdPodanejPrzezUzytkownika[i] + ",");
            }
        }
        System.out.println();
    }

    public static void wypiszPodzielnePrzezDowolna(int[] liczbyMniejszeOdPodanejPrzezUzytkownika) {
        int dzielnik = wczytajDzielnik();
        System.out.println("oto liczby mniejsze i podzielne przez " + dzielnik);
        for (int i = 1; i < liczbyMniejszeOdPodanejPrzezUzytkownika.length; i++) {
            if (liczbyMniejszeOdPodanejPrzezUzytkownika[i] % dzielnik == 0) {
                System.out.print(liczbyMniejszeOdPodanejPrzezUzytkownika[i] + ",");
            }
        }
        System.out.println();
    }

    public static void wybierzDzialanie() {
        System.out.println("Wybierz dzialanie: \na: wypisanie wszystkich mniejszych od podanej liczby\n" +
                "b: wypisanie wszystkich mniejszych i podzielnych przez 2 od podanej liczby\n" +
                "c: wypisanie wszystkich mniejszych i podzielnych przez 3 od podanej liczby\n" +
                "d: wypisanie wszystkich mniejszych i podzielnych przez dowolna liczbe calkowita od podanej liczby\n");
        Scanner scan = new Scanner(System.in);

        char wybraneDzialanie = scan.next().charAt(0);

        switch (wybraneDzialanie) {
            case 'a':
                wypiszLiczby(wczytajLiczbe());
                break;
            case 'b':
                wypiszPodzielnePrzez2(wypiszLiczby(wczytajLiczbe()));
                break;
            case 'c':
                wypiszPodzielnePrzez3(wypiszLiczby(wczytajLiczbe()));
                break;
            case 'd':
                wypiszPodzielnePrzezDowolna(wypiszLiczby(wczytajLiczbe()));
                break;

        }
    }
}
