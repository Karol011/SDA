package Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie5;

import java.util.Arrays;

public class Book {
    String title;
    String isbn;
    int releaseDate;
    Author[] authors = new Author[3];
    public int numberOfAuthors;

    public Book(String title, String isbn, int releaseDate) {
        this.title = title;
        this.isbn = isbn;
        this.releaseDate = releaseDate;
        Author[] authors = new Author[3];
        this.numberOfAuthors = 0;
    }

    public void addAuthor(Author newlyAddedAuthor) {
        for (int i = 0; i < 3; i++) {
            if (authors[i] == null) {
                authors[i] = newlyAddedAuthor;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", releaseDate=" + releaseDate +
                ", authors=" + Arrays.toString(authors)+
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }
}
