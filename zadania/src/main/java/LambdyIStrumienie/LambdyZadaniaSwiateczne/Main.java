package LambdyIStrumienie.LambdyZadaniaSwiateczne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book("Krzyzacy", "Sienkiewicz", 1),
                new Book("Tytul", "Autor", 10),
                new Book("CosInnego", "Karolsky", 5)
        ));
        Book book = new Book("Krzyzacy i 9  krasnolÓdkÓw", "Sienkiewicz", 1);
        Book book2 = new Book("Tytul", "Autor", 10);
        Book book3 = new Book("CosInnego", "Karolsky", 5);
        System.out.println(Book.authorsOf(book, book2, book3, new Book("asd", "asdsdd", 1), new Book("tyyytuul", "sss", 12)));
       // System.out.println(Book.byTitle(bookList));


       // System.out.println(Book.keywordsIn(book, book2, book3));
        System.out.println(Book.byTitle(book2));
    }

}
