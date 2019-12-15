package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;


//for nieparzyste 0 -100
public class petla {
    public static void main(String[] args) {
//parzyste
      /*  for (int i = 1; (i < 101); i++) {
            if (i % 2 == 0)
                System.out.println("liczba nieparzysta:" + i);
        }
        //podzielne przez 7
        for (int i = -100; (i < 1001); i++) {
            if (i % 7 == 0)
                System.out.println("liczba do tysiaca podzielna przez 7 :" + i);
        }
        //wybrane od uzytkownika podzielne przez 3 i 7


        int liczba1;
        System.out.println("Podaj  liczbe");
        Scanner zmiennaTypuScanner1 = new Scanner(System.in);
        liczba1 = zmiennaTypuScanner1.nextInt();

        for (int i = -liczba1; i <= liczba1; i++) {
            if (i % 3 == 0 && i % 7 == 0)
            System.out.println("liczba spelniajace warunki: " + i);
        }
*/
      //podane przez uzytkownika i podzielkne przez siebie
/*
        int liczba2;
        System.out.println("Podaj  liczbe");
        Scanner zmiennaTypuScanner1 = new Scanner(System.in);
        liczba2 = zmiennaTypuScanner1.nextInt();

        int dzielnik;
        System.out.println("Podaj  dzielnik");
        Scanner zmiennaTypuScanner2 = new Scanner(System.in);
        dzielnik = zmiennaTypuScanner2.nextInt();

        for (int i = liczba2; i <= liczba2 && i >= -1000; i--) {
            if (i % dzielnik == 0)
                System.out.println("liczba spelniajace warunki: " + i);
        }


 */
int liczbaN;
        System.out.println("podaj liczbe N");
        Scanner zmiennaScannerN = new Scanner(System.in);
        liczbaN = zmiennaScannerN.nextInt();

        int liczbaM;
        System.out.println("podaj liczbe M ");
        Scanner zmiennaScannerM = new Scanner(System.in);
        liczbaM = zmiennaScannerM.nextInt();

        int potega;
        potega = liczbaN ^ liczbaM;

        System.out.println("potegi " + potega);






        }


    }
