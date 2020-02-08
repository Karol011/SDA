package LambdyIStrumienie.LambdyZadaniaSwiateczne;

import lombok.ToString;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Zaimplementuj poniższe metody z użyciem wyrażeń lambda i/lub klas Stream oraz Optional.
 */
@ToString
public class Book {

    private final String title;
    private final String author;
    private final int numEditions;

    Book(String title, String author, int numEditions) {
        this.title = title;
        this.author = author;
        this.numEditions = numEditions;
    }


    private String getTitle() {
        return title;
    }

    private String getAuthor() {
        return author;
    }

    public int getNumEditions() {
        return numEditions;
    }


    /**
     * Znajduje autora książki o podanym tytule.
     */
    public Optional<String> findAuthorByTitle(BookRepository repository, String title) {
        throw new UnsupportedOperationException("Not implemented yet");
    }


    /**
     * Funkcja zwraca listę autorów książek znajdujących się na podanej liście.
     * Wynikowa lista jest posortowana alfabetycznie oraz nie zawiera duplikatów.
     */
    static List<String> authorsOf(Book... books) {
        //throw new UnsupportedOperationException("Not implemented yet");
        List<String> stringList = Arrays.stream(books)
                .map(Book::getAuthor)
                .distinct()
                .sorted(String::compareTo)
                .collect(Collectors.toCollection(LinkedList::new));
        return stringList;
    }

    /**
     * Funkcja zwraca wszystkie słowa występujące w tytułach podanych książek.
     * Znaki inne niż litery i cyfry (non-word characters) są usunięte z wyrazów.
     * Zwrócone wyrazy zapisane są małymi literami.
     */
   // public Set<String> keywordsIn(Book... books) {
        //  throw new UnsupportedOperationException("Not implemented yet");
      /*  Set<String> stringSet = Arrays.stream(books)
                .map(s ->s.getTitle())
                    .flatMap(s -> s.split(" "))
                .map(s -> (String)s)
                .map(String::replaceAll("\\W",""))
                .collect(Collectors.toSet());
        return stringSet;

    }
*/
    /**
     * Zwraca mapę pozwalającą znaleźć książki po tytule.
     */
    static Map<String, Book> byTitle(Book... books) {
        Map<String,Book> bookMap = Arrays.stream(books)
                .collect(Collectors.toMap(Book::getTitle, Function.identity()));
return bookMap;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    ////////////////////////////////////////////
    //                                        //
    // PONIŻEJ ZADANIA DODATKOWE DLA CHĘTNYCH //
    //                                        //
    ////////////////////////////////////////////

    /**
     * Zwraca mapę pozwalającą znaleźć książki po autorze.
     */
   /* public Map<String, Set<Book>> byAuthor(List<Book> books) {
        throw new UnsupportedOperationException("Not implemented yet");
        books.stream()
                .map(b -> b.getAuthor())
                .collect(Collectors.toMap(b., Function.identity()));

    }*/

    /**
     * Funkcja zwraca z podanej list książkę, która ma najwięcej edycji.
     * Jeśli więcej niż jedna książka ma tyle samo edycji, zwrócona jest książka pierwsza w kolejności.
     * <p>
     * Podpowiedź: przyda się funkcja Stream.reduce.
     */
 /*   public Optional<Book> findMostEditions(Book... books) {
        throw new UnsupportedOperationException("Not implemented yet");
    }*/

    /*
     * Zmodyfikuj metodę byAuthor oraz odpowiadający jej Zgapa.test
     * aby zwracała obiekt klasy Multimap z biblioteki Guava.
     *
     * Uwaga: musisz dodać tę bibliotekę do zależności projektu.
     */


}