package Testowanie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;


@Setter
@Getter
public class Ksiazka {
    String autor;
    int iloscStron;

    public Ksiazka(String autor, int iloscStron) {
        this.autor = autor;
        this.iloscStron = iloscStron;
    }



    @Override
    public String toString() {
        return "Ksiazka{" +
                "autor='" + autor + '\'' +
                ", iloscStron=" + iloscStron +
                '}';
    }
}
