package Kolekcje.Kolekcje2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Figura kwadrat1 = new Kwadrat(4);
        Figura kwadrat2 = new Kwadrat(3);
        Figura prostokat1 = new Prostokat(4,5);
        Figura prostokat2 = new Prostokat(2,10);
        Figura kwadrat3 = new Kwadrat(7);

        System.out.println(kwadrat1.obliczPole());

        Set<Figura> figury = new HashSet<>();
        figury.add(kwadrat1);
        figury.add(kwadrat2);
        figury.add(kwadrat3);
        figury.add(prostokat1);
        figury.add(prostokat2);

        System.out.println(figury);
    }
}
