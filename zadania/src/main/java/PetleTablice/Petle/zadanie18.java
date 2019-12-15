package PetleTablice.Petle;

import java.util.Random;
import java.util.Scanner;

/*
18. Stwórz pętle do...while w której :
a. pytaj użytkownika o liczbę z zadanego przedziału (przedział od-do wylosuj).
Dopóki użytkownik będzie podawał liczbę z poza przedziału powtarzaj pętle
 */
public class zadanie18 {
    public static void main(String[] args) {
        int pierwszaLiczbaZPrzedzialu = pierwszaLiczbaPrzedzialu();
        int drugaLiczbaZPrzedzialu = drugaLiczbaPrzedzialu();

        if (pierwszaLiczbaZPrzedzialu < drugaLiczbaZPrzedzialu) {
            podajLiczbeZprzedzialu(pierwszaLiczbaZPrzedzialu, drugaLiczbaZPrzedzialu);
        } else {
            podajLiczbeZprzedzialu(drugaLiczbaZPrzedzialu, pierwszaLiczbaZPrzedzialu);

        }
    }

    public static int pierwszaLiczbaPrzedzialu() {
        int pierwszaLiczbaZPrzedzialu = 0;
        Random random = new Random();
        pierwszaLiczbaZPrzedzialu = random.nextInt(200) - 100;
        return pierwszaLiczbaZPrzedzialu;
    }

    public static int drugaLiczbaPrzedzialu() {
        int drugaLiczbaZPrzedzialu = 0;
        Random random = new Random();
        drugaLiczbaZPrzedzialu = random.nextInt(200) - 100;
        return drugaLiczbaZPrzedzialu;
    }

    public static void podajLiczbeZprzedzialu(int pierwszaLiczbaPrzedzialu, int drugaLiczbaPrzedzialu) {
        int liczbaPodanaPrzezUzytkownika = 0;
        // System.out.println("Podaj liczbe od " + pierwszaLiczbaPrzedzialu + " do " + drugaLiczbaPrzedzialu);

        do {
            System.out.println("Podaj liczbe od " + pierwszaLiczbaPrzedzialu + " do " + drugaLiczbaPrzedzialu);
            Scanner scan = new Scanner(System.in);
            liczbaPodanaPrzezUzytkownika = scan.nextInt();

        } while (liczbaPodanaPrzezUzytkownika < pierwszaLiczbaPrzedzialu || liczbaPodanaPrzezUzytkownika > drugaLiczbaPrzedzialu);
        System.out.println("Brawo, NARESZCIE Ci sie udalo...");
    }

}
