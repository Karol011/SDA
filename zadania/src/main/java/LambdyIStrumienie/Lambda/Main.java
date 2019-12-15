package LambdyIStrumienie.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("tomek");
        listaStringow.add("tomasz");
        listaStringow.add("to masz to czy tego nie masz?");
        listaStringow.add("tomeczek");
        listaStringow.add("tomi");

        Collections.sort(listaStringow,(str1,str2)->Integer.compare(str2.length(),str1.length()) ); //Integer.compare bo porownujemy dlugosc Stringow, czyli int

        listaStringow.forEach(str -> System.out.println(str));
        System.out.println(listaStringow);

    }

}
