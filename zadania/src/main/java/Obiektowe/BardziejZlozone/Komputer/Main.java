package Obiektowe.BardziejZlozone.Komputer;

/*
Zadanie 1
Stwórz klasę Komputer która posiada pola:
potrzebna moc (int)
producent (string)
typ proceseora (enum o nazwie TypProcesora z wartościami: WIELORDZENIOWY/JEDNORDZENIOWY)
Stwórz klasę dziedziczącą Laptop która posiada dodatkowe pole:
wielkosc matrycy (double)
czy posiada retine (boolean)
Stwórz kilka obiektów typu Laptop i typu Komputer. Umieść je w tabelach, a następnie wypisz pętlą while.

*Dla laptopów (żeby sprawdzić czy komputer jest Laptopem zastosuj instanceof) wypisz rowniez ich wielkosc matrycy.
 */
public class Main {
    public static void main(String[] args) {
        Komputer komputerBartka = new Komputer(3000, "intel", "Bartek", TypProcesora.WIELORDZENIOWY);
        Komputer komputerKasi = new Komputer(2000, "intel", "Kasia", TypProcesora.JEDNORDZENIOWY);
        Komputer komputerMacka = new Komputer(10000, "amd", "Maciek", TypProcesora.WIELORDZENIOWY);
        Komputer laptopKaroliny = new Laptop(4000, "amd", "Karolina", TypProcesora.JEDNORDZENIOWY, 15.6, true);
        Komputer laptopMichala = new Laptop(3200, "intel", "Michal", TypProcesora.JEDNORDZENIOWY, 13.2, false);
        Komputer laptopZeSmietnika = new Laptop(500, "intel", "Smietnik", TypProcesora.JEDNORDZENIOWY, 9.9, false);

        Komputer[] spisKomputerow = {komputerBartka, komputerKasi, komputerMacka, laptopKaroliny, laptopMichala, laptopZeSmietnika};
        wypiszKomputeryWhilem(spisKomputerow);
        System.out.println();
    }

    public static void wypiszKomputeryWhilem(Komputer[] spisKomputerow) {

        int i = 0;
        while (i < spisKomputerow.length) {
            if (spisKomputerow[i] instanceof Laptop) {
                System.out.print("Laptop ");
            }

            System.out.println(spisKomputerow[i].toString());


            i++;
        }
    }
}
