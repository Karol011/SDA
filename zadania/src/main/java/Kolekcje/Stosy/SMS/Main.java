package Kolekcje.Stosy.SMS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      /*  MessageInbox messageInbox = new MessageInbox();
        Deque<Message> wiadomosci = new ArrayDeque<>();
        messageInbox.addMessage("ajshda");
        messageInbox.addMessage("duppa");
        messageInbox.addMessage("kanarkiliii");

        wiadomosci.add(new Message("sadsad"));
        messageInbox.deleteNewestMessage();
        //System.out.println(wiadomosci.peek());
        messageInbox.listMessages();*/
        Map<String, MessageInbox> messageInboxMap = new HashMap<>();
        Phone phone = new Phone(messageInboxMap);
        phone.addMessagePhone("karol", "message 1");
        phone.addMessagePhone("karol", "karmel");
        phone.addMessagePhone("kamilek", "ciastko");

        phone.listMessages("karol");
        phone.listMessages("kamilek");

        phone.removeFirstMessageFromContact("karol");
        phone.removeFirstMessageFromContact("karol");
        phone.removeFirstMessageFromContact("karol");
        phone.listMessages("karol");


    }
}

/*
Zadanie 4:
Problem:
W zasadzie to nie problem, ale potrzebujemy sposobu na przechowywanie wiadomości w naszych telefonach. Normalnie, wiadomości są w pewien sposób ułożone. Naturalnym jest, że po otrzymaniu wiadomości pojawia się ona na szczycie naszej skrzynki odbiorczej. Gdybyśmy chcieli wyciągnąć wiadomość ze skrzynki, to OSTATNIA OTRZYMANA WIADOMOŚĆ, BĘDZIE PIERWSZĄ DO USUNIĘCIA. Pierwsza wersja tej aplikacji (bez rozszerzenia) to dodawanie wszystkich wiadomości do jednej skrzynki - trochę jak nokia 3310.

Stwórz klasę Wiadomość która posiada pola:
- Treść wiadomości
- data odebrania

Dodaj do klasy Wiadomość metody:
- gettery oraz settery do klasy

Stwórz klasę SkrzynkaOdbiorcza wiadomości, która posiada pola:
- stos wiadomości

Dodaj do klasy metody:
- dodajWiadomość(String tresc):void - która Tworzy nową instancję klasy Wiadomość i ustawia czas odebrania jako aktualny czas (now()). Po otrzymaniu wiadomości dodaj ją do stosu wiadomości.
- usuńNajnowsząWiadomosc():Wiadomość - która usuwa i ZWRACA najnowszą wiadomość z komunikatem 'Usunięto: '+wiadomość.
- wylistujWiadomosci():void - metoda która wypisuje wszystkie wiadomości ze stosu w kolejności ich otrzymania (po kolei cały stos)

ROZSZERZENIE DO APLIKACJI:
Dopiszemy rozszerzenie, które pozwoli nam przechować wiadomości od różnych wysyłających. Od teraz każdy kto do nas pisze będzie posiadał własną skrzynkę (już nie jak w nokii, tylko coś na podobieństwo czatu w smartfonie).

Stwórz klasę Telefon która posiada:
- mapę wiadomości, w której kluczem jest numer/nazwa odbiorcy, a wartością jest skrzynka odbiorcza tego odbiorcy

Dodaj do klasy Telefon metody:
- dodajWiadomosc(String nadawca, String tresc):void - która odnajduje skrzynkę odbiorczą podanego czatu, a następnie wywołuje na niej dodanie wiadomości.
- listujWiadomosci(String nadawca):List<Wiadomość> - metoda listuje wszystkie wiadomości podanego nadawcy. Po zwróceniu listy wiadomości wypisz ich informacje w tej samej kolejnosci.
- usunOstatniaWiadomosc(String odNadawcy):Wiadomość - metoda usuwa z podanej skrzynki odbiorczej ostatnią wiadomość, ale również ZWRACA tę wiadomość z komunikatem o usunięciu "Usunięto " + wiadomość + " ze skrzynki odbirczej nadawcy " + nadawca.

 */
