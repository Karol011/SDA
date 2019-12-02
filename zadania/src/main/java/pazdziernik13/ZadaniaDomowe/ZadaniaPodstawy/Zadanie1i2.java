package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.ZadaniaPodstawy;

/*
        Zadanie 1.
         Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
          Stwórz instrukcję warunkową ('if') który sprawdza czy osoba
          (np. taka która  na kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
        Wypisz finalnie komunikat:
        "Możesz wejść na kolejkę"
        lub
        "Nie możesz wejść na kolejkę"
        w zależności od tego czy osoba może lub nie może wejść na kolejkę
  */
/*
        Zadanie 2. Rozwinięcie poprzedniego zadania:
Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest młodsza niż 10 lat,
 lub starsza niż 80, to nie może wejść na kolejkę.
Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.

Dopisz deskryptywne wyjasnienia.
-Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego. np.
 “Nie możesz wejść na kolejkę ponieważ jesteś zbyt ciężki/a”
-Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
-Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac INNY komunikat o tym ze nie moze wejsc z powodu wieku.


*/
public class Zadanie1i2 {
    public static void main(String[] args) {
        int waga = 80, wzrost = 160, wiek = 55;

        if (wzrost > 150 && wzrost < 220 && waga < 180 && wiek > 10 && wiek < 80) {
            System.out.println("mozesz wejsc");
        } else if (wzrost < 150) {
            System.out.println("nie mozesz wejsc jestes za niski");
        } else if (wzrost > 220) {
            System.out.println("nie mozesz wejsc jestes za wysoki");
        } else if (waga > 180) {
            System.out.println("nie mozesz wejsc jestes za gruby");
        } else if (wiek < 10) {
            System.out.println("nie mozesz wejsc jestes za mlody");
        } else if (wiek > 80) {
            System.out.println("nie mozesz wejsc jestes za stary");
        } else {
            System.out.println("nie mozesz wejsc z innego powodu");
        }
    }

}



