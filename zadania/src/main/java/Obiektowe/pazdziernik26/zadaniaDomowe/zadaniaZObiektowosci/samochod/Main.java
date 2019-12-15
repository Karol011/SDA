package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaZObiektowosci.samochod;

public class Main {
    public static void main(String[] args) {
        Samochod ferrari = new Samochod("Ferrari",220);
        Samochod passat = new Samochod("passat",100);

        ferrari.wypiszInformacjeOSamochodzie();
        ferrari.przyspiesz05kmh();
        ferrari.wypiszInformacjeOSamochodzie();

        passat.wypiszInformacjeOSamochodzie();
        passat.zwolnij05kmh();
        passat.zwolnij05kmh();
        passat.wypiszInformacjeOSamochodzie();

    }
}
