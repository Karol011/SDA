package Obiektowe.BardziejZlozone.Zamowienia;

/*
Zadanie 5
Napisać program do obsługi zamówień. Program powinien składać się z klas Zamowienie oraz Pozycja.
Zamowienie ma pole pozycje (Pozycje[]), maksRozmiar oraz konstruktor(maxRozmiar) i konstruktor bezargumentowy (gdzie maksRozmiar=10), a także metody dodajPozycje(Pozycja) i obliczWartosc():double, toString() zwraca spis pozycji zamówienia.
Pozycja posiada 3 pola: nazwaTowaru, iloscSztuk, cenaSztuki, oraz metody: obliczWartosc() i toString().
Przykładowy wynik działania programu:
Zamówienie:
Chleb        2.00 zł        2 szt.         4.00 zł
Banany        6.00zł        1 szt.        6.00 zł
Razem: 10.00 zł
 */
public class Main {
    public static void main(String[] args) {


        Pozycja chleb = new Pozycja("chleb", 1, 2.0);
        Pozycja kapusta = new Pozycja("kapusta", 3, 1.3);
        Pozycja ziemniaki = new Pozycja("ziemniaki", 1, 0.5);

        Zamowienie zamowienie = new Zamowienie(4);

        zamowienie.dodajPozycje(chleb);
        zamowienie.dodajPozycje(kapusta);
        zamowienie.dodajPozycje(kapusta);
        zamowienie.dodajPozycje(ziemniaki);

        zamowienie.obliczWartosc();
        System.out.println(zamowienie.toString());

    }
}
