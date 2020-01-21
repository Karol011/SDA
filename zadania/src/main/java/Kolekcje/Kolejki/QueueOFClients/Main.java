package Kolekcje.Kolejki.QueueOFClients;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Client c1 = new Client("Karol", false);
        Client c2 = new Client("Marcin", false);
        Client c3 = new Client("Agata", true);
        Client c4 = new Client("Karolina", false);

        PriorityQueue<Client> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(c1);
        Thread.sleep(100);
        priorityQueue.add(c2);
        Thread.sleep(100);
        priorityQueue.add(c3);
        Thread.sleep(1000);
        priorityQueue.add(c4);
        priorityQueue.add(new Client("Zenek", true));

        WaitingRoom waitingRoom = new WaitingRoom(priorityQueue);

        //System.out.println(waitingRoom.getClient());

//        System.out.println(waitingRoom.getClient().toString());
        //      System.out.println(waitingRoom.getClient().toString());
        waitingRoom.printAllClients();
    }
}
/*
Zadanie 2:
Problem:
Stworzymy aplikację kontrolującą kolejność pobierania elementów z obiektu.
Spróbujemy zrealizować zadanie reprezentujące kolejkę na poczcie lub w pewnej poczekalni.

Stwórz klasę Klient, która posiada:
- imie klienta (wyłącznie dla celów prezentacji - żeby później łatwiej nam było czytać poprawność wyników)
- czas przybycia
- czy jest priorytetem (tak lub nie)

Stwórz klasę Poczekalnia, która jako pola posiada:
- KOLEJKĘ PRIORYTETOWĄ klientów

Do klasy poczekalnia dodaj metody:
- dodajKlienta(String imie, boolean czyPriorytet):void - która dodaje klienta o podanym imieniu z informacją czy jest priorytetyzowany.
W metodzie stwórz instancje klasy Klient i ustaw mu wartości wszystkich pól. Czas dodania ustaw na 'now()' czyli moment dodania go do kolejki.
- pobierzKlienta():Klient - która zwraca następnego w kolejce klienta
- wypiszKolejnoKlientów():void - metoda która wyciąga z kolejki klientów dopóki w kolejce są jacyś klienci.
Wraz 'wyciąganiem' klientów wypisuj ich informacje na ekran.

Wskazówka: https://stackoverflow.com/questions/26100977/how-to-sort-a-priorityqueue-with-bool-and-date-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa

 */
