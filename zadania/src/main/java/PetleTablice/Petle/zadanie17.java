package PetleTablice.Petle;

/*
17. Napisać program, który w pętli for oraz while wypisuje:
a. liczby od -200 do -1000 (pętla która co krok dokonuje dekrementacji).
b. liczby od 1000 do 100000 w jednej linii, a co 1000 liczbę dodaj wypisanie
nowej linii.
c. tabliczkę mnożenia od 5x10
d. tabliczkę mnożenia a x b - gdzie zmienne a i b załaduj ze scanner’a
 */
public class zadanie17 {
    public static void main(String[] args) {
        // punktAWPetliFor();
        //punktAWPetliWhile();
        //punktBWPetliFor();
        //punktBWPetliFor();
      //  punktCWPetliFor();
        punktCWPetliWhile();
    }

    public static void punktAWPetliFor() {
        for (int i = -200; i > -1001; i--) {
            System.out.print(i + ",");
        }
    }

    public static void punktAWPetliWhile() {
        int i = -200;
        while (i > -1001) {
            System.out.print(i + ",");
            i--;
        }
    }

    public static void punktBWPetliFor() {
        for (int i = 1000; i < 10001; i++) {
            System.out.print(i + ",");
            if (i % 1000 == 0) {
                System.out.println();
            }
        }
    }

    public static void punktBWPetliWhile() {
        int i = 1000;
        while (i < 10001) {
            System.out.print(i + ",");
            i++;
            if (i % 1000 == 0) {
                System.out.println();
            }
        }
    }

    public static void punktCWPetliFor() {
        for (int i = 5; i < 11; i++) {
            System.out.println();
            for (int j = 5; j < 11; j++) {
                System.out.print(i * j + ",");
            }

        }
    }

    public static void punktCWPetliWhile() {
        int i = 5;
        while (i < 11) {
            for (int j = 5; j < 11; j++) {
                System.out.print(i * j + ",");
            }
            System.out.println();
            i++;
        }
    }
}
