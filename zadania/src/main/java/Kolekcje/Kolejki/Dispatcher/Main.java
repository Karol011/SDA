package Kolekcje.Kolejki.Dispatcher;

public class Main {
}
/*
Zadanie 3:
Problem:
System dla dyspozytorni (112). W dyspozytorni istnieje problem dodawania i katalogowania zgłoszeń.
 Każde zgłoszenie musi mieć swój własny identyfikator i aby prościej je było odnajdować,
 trzeba stworzyć filtrację i enuma którym będziemy reprezentować typ zgłoszenia.

Stwórz enuma o nazwie TypZgłoszenia który przyjmuje wartości:
KARETKA, POLICJA, STRAŻ, WYPADEK, ZGŁOSZENIE_INNE

Pierwsze 4 są raczej oczywiste. Dzwoniący może zgłosić problem np. uszkodzenia na drodze, zgłoszenia wandalizmu lub innych rzeczy.

Stwórz klasę Zgłoszenie które posiada pola:
- typ zgłoszenia
- treść zgłoszenia
- czas zgłoszenia

Stwórz klasę Dyspozytornia, która posiada pola:
- mapę zgłoszeń (kluczem jest unikalny identyfikator, najlepiej typu String)

dodaj do klasy Dyspozytornia metody:
- dodajZgloszenie(String tresc, TypZgloszenia typ):void - która tworzy nową instancję "Zgłoszenia" i dodaje je do mapy
(spróbuj wymyślić unikalny identyfikator zgłoszenia) Wskazówka:  http://www.baeldung.com/java-uuid
- zwróćNajaktualniejszeZgłoszenia(int ilosc):List<Zgłoszenie> - metoda która sortuje zgłoszenia po czasie i zwraca 'ilość' zgłoszeń z parametru.
- zwróćZgłoszeniaTypu(TypZgłoszenia typ):List<Zgłoszenie> -
metoda znajduje w mapie tylko zgłoszenia podanego typu i zwraca je wszystkie POSORTOWANE PO CZASIE DODANIA

Dodaj w metodzie main obsługę wiersza poleceń, a w nim komendy:
- dodaj TYP TREŚĆ
- listuj 3
- listuj TYP

 */
