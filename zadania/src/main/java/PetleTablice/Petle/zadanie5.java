package PetleTablice.Petle;

import java.util.Scanner;

/*
5. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B,
   a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B).
    Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.

Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60
 */
public class zadanie5 {
    public static void main(String[] args) {
        System.out.println("program wyliczy sume ciagow podanych liczb calkowitych, za pomoca petli while i for");
        System.out.println("Podaj pierwsza liczbe calkowita: ");//wczytanie pierwszej liczby
        int liczba1;
        Scanner zmiennaScanner1 = new Scanner(System.in);
        liczba1 = zmiennaScanner1.nextInt();

        System.out.println("Podaj druga liczbe calkowita: ");//wczytanie drugiej liczby
        int liczba2;
        Scanner zmiennaScanner2 = new Scanner(System.in);
        liczba2 = zmiennaScanner2.nextInt();
        int sumaWhile = 0;
        int sumaFor = 0;                   //deklaracja pomocniczych zmiennych przed petla while, poniewaz inaczej
        // moglyby nie zostac zainicjowane (niespelnienie warunku IFa)

        if (liczba1 < liczba2) {//sprawdzenie czy liczba1 < liczba2
            int i = liczba1;        //sumowanie ciagu whilem
            while (i <= liczba2) {
                sumaWhile = sumaWhile + i;
                i++;
            }
            for (int j = liczba1; j <= liczba2; j++) {
                sumaFor = sumaFor + j;
            }

        } else {//gdy liczba1 > liczba2
            System.out.println("Pierwsza liczba musi byc mniejsza od drugiej!");
        }
        //program glowny
        System.out.println("Suma ciagu liczby " + liczba1 + " i " + liczba2 + " wynosi " + sumaWhile + "," + sumaFor);


    }
}
