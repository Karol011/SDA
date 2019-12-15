package Inne.ZapisOdczytZPlikow;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListaDoPliku {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("C:\\Users\\rudaz\\Desktop\\Lista.txt");

        List<String> lista = new ArrayList<>();
        lista.add("cos");
        lista.add("kot");
        lista.add("piesel");
        lista.add("janusz");
        lista.add("jakas dluzsza linijka");
        lista.add("cos");
        lista.add("cosiek");
        for (String s:lista) {
            printWriter.append(s + "\n");
        }

     /*   for (int i = 0; i < lista.size(); i++) {
            printWriter.append(lista.get(i) + "\n");
        }*/
        printWriter.close();


    }
}
