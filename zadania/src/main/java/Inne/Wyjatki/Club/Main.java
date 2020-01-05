package Inne.Wyjatki.Club;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        club.enter(new Person("karol","karolsky",21));

        club.showPeopleINClub();

        club.enter(new Person("ziomek","isjdsa",12));

    }
}
/*
3.	Napisz klasę Person, Club, NoAdultException. Klasa Person powinna zawierać, imię, nazwisko i wiek.
Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.
 */