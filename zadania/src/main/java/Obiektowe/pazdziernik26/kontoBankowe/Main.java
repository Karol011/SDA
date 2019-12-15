package sda.pl.javagda34.pazdziernik26.kontoBankowe;
/*
1.Utwórz klasę KontoBankowe
2.Nadaj pola publiczne :
    •numerKonta: long
    •stanKonta: int
3.Utwórz metody:
    •wyswietlStanKonta():void
    •wplacSrodki(int):void
    •pobierzSrodki(int):int
4.Utwórz 2 obiekty:
    1.kontoAndrzeja(123L, 1000)
    2.kontoBeaty(555L, 2000)
    3.Przetestuj przesyłpieniędzy pomiędzy kontami
 */
public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoAndrzeja = new KontoBankowe(123L, 1000,"Andrzej");
        KontoBankowe kontoBeaty = new KontoBankowe(555L, 2000,"Beata");

        /*kontoAndrzeja.wyswietlStanKonta();
        kontoAndrzeja.wplacSrodki(500);
        kontoAndrzeja.wyswietlStanKonta();
        kontoAndrzeja.pobierzSrodki(300);1
        kontoAndrzeja.wyswietlStanKonta();*/

        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();
        kontoAndrzeja.wplacSrodki(kontoBeaty.stanKonta - kontoBeaty.pobierzSrodki(100));
        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();
    }
}