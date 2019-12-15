package Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie5;

import java.util.Scanner;

/*
Zadanie 5:
Zaimplementuj aplikację która pozwala tworzyć i przechowywać obiekty Book i Author. Każda książka (Book) może mieć maksymalnie 3 autorów. Książka posiada pola:
- tytuł:String
- isbn:String
- rokWydania:int
- autorzy:Author[3] (tablica stałej długości)
- ilośćAutorów:int (pole pomocnicze)
Klasa Author:
- imie:String
- nazwisko:String
Aplikacja powinna przechowywać 10 książek (stwórz je na sztywno w Main). Książki domyślnie nie mają autorów (ilość autorów = 0,
ale autorzy [tablica] jest zainicjowana na sztywno z długością 3). Aplikacja ma umożliwiać dodawanie i wypisywanie autorów poprzez komendy. Przykład działania:
# poprawne działanie
Co chcesz zrobić? [wypisz, dodaj, quit]
wypisz
Podaj tytuł książki:
Pan Tadeusz
Ta książka nie ma autorów.
Co chcesz zrobić? [wypisz, dodaj, quit]
dodaj
Podaj tytuł książki:
Pan Tadeusz
Podaj imie i nazwisko autora:
Henryk Sienkiewicz
Autor dodany.
Co chcesz zrobić? [wypisz, dodaj, quit]
wypisz
Pan Tadeusz
Pan Tadeusz, autorzy:
Henryk Sienkiewicz
Co chcesz zrobić? [wypisz, dodaj, quit]
quit
# złe działanie
Co chcesz zrobić? [wypisz, dodaj, quit]
wypisz
Podaj tytuł książki:
Pan Tadeuszek
Nie ma takiej książki
Co chcesz zrobić? [wypisz, dodaj, quit]
dodaj
Podaj tytuł książki:
Pan Tadeuszek
Nie ma takiej książki
Co chcesz zrobić? [wypisz, dodaj, quit]
wypisz
Pan Tadeuszek
Nie ma takiej książki
Co chcesz zrobić? [wypisz, dodaj, quit]
quit
 */
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Krzyzacy", "aaa", 1992);
        Book b2 = new Book("aaa", "aaa", 1992);
        Book b3 = new Book("bbb", "aaa", 2008);
        Book b4 = new Book("ccc", "aaa", 1554);
        Book b5 = new Book("ddd", "aaa", 1992);
        Book b6 = new Book("eee", "aaa", 1992);
        Book b7 = new Book("fff", "aaa", 3006);
        Book b8 = new Book("ggg", "aaa", 1992);
        Book b9 = new Book("hhh", "aaa", 1992);
        Book b10 = new Book("iii", "aaa", 1992);

        Book[] books = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
        start(books);
    }

    public static void start(Book[] books) {
        String action;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What would you like to do?\n" +
                    "[print, add, quit]");
            action = scanner.nextLine();
            switch (action) {
                case "print":
                    print(books);
                    break;
                case "add":
                    add(books);
                    break;
                default:
                    System.out.println("wrong command");
            }


        } while (!action.equals("quit"));
        System.out.println("The end :)");
    }

    protected static void add(Book[] books) {

        Scanner scanner = new Scanner(System.in);
        String title;
        boolean bookExists = false;


        System.out.println("Title?");
        title = scanner.nextLine();

        for (Book element :
                books) {
            if (element.getTitle().equals(title)) {
                bookExists = true;
                if (element.getNumberOfAuthors() == 3) {
                    System.out.println("The book can have 3 authors at most");
                } else {
                    String name;
                    String surName;

                    System.out.println("Name?");
                    name = scanner.nextLine();
                    System.out.println("Surname?");
                    surName = scanner.nextLine();
                    Author newlyAddedAuthor = new Author(name, surName);
                    element.addAuthor(newlyAddedAuthor);
                    element.setNumberOfAuthors(element.getNumberOfAuthors() + 1);
                }


            }
        }
        if (!bookExists) {
            System.out.println("There is no such book, sorry :(");

        }


    }

    public static void print(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        String title;
        boolean bookExists = false;


        System.out.println("Title?");
        title = scanner.nextLine();

        for (Book element :
                books) {
            if (element.getTitle().contains(title)) {
                System.out.println(element.toString());
                bookExists = true;
                break;
            }
        }
        if (!bookExists) {
            System.out.println("There is no such book, sorry :(");

        }


    }


}
