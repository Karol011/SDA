package Testowanie;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Student extends Osoba{
    String ulubionyPrzedmiot;
    Ksiazka ksiazka;

    public Student(String imie, String nazwisko, int wiek, String ulubionyPrzedmiot, Ksiazka ksiazka) {
        super(imie, nazwisko, wiek);
        this.ulubionyPrzedmiot = ulubionyPrzedmiot;
        this.ksiazka = ksiazka;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ulubionyPrzedmiot='" + ulubionyPrzedmiot + '\'' +
                ", ksiazka=" + ksiazka +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
