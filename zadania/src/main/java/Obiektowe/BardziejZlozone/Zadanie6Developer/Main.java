package Obiektowe.BardziejZlozone.Zadanie6Developer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Mieszkanie m1 = new Mieszkanie(100, 3400, 3, 1, new double[]{40, 35, 15}, SunGeograficalLocation.NORTH);
        Mieszkanie m2 = new Mieszkanie(200, 3200, 5, 2, new double[]{40, 50, 17, 35, 15}, SunGeograficalLocation.EAST);
        Mieszkanie m3 = new Mieszkanie(120, 6100, 2, 1, new double[]{40, 35, 15}, SunGeograficalLocation.SOUTH);
        Mieszkanie m4 = new Mieszkanie(100, 4400, 3, 1, new double[]{40, 35, 15}, SunGeograficalLocation.NORTH_EAST);
        Mieszkanie m5 = new Mieszkanie(87.5, 5100, 2, 1, new double[]{40, 35, 15}, SunGeograficalLocation.NORTH);

        Mieszkanie m6 = new Mieszkanie(100, 3400, 3, 1, new double[]{40, 35, 15}, SunGeograficalLocation.SOUTH);
        Mieszkanie m7 = new Mieszkanie(145, 3000, 4, 1, new double[]{50, 35, 15, 20}, SunGeograficalLocation.SOUTH);
        Mieszkanie m8 = new Mieszkanie(133, 3900, 3, 1, new double[]{40, 35, 25}, SunGeograficalLocation.EAST);

        Mieszkanie[] listaMieszkan1 = new Mieszkanie[]{m1, m2, m3, m4, m5};
        Mieszkanie[] listaMieszkan2 = new Mieszkanie[]{m6, m7, m8};

        Budynek b1 = new Budynek("Palmowe", "Konopnicka 6", 5, 3, 2020, 1, 100, 3, listaMieszkan1);
        Budynek b2 = new Budynek("Palmowe", "Konopnicka 7", 3, 4, 2021, 2, 110, 4, listaMieszkan2);


        List<Budynek> oferty = new ArrayList<>();
        oferty.add(b1);
        oferty.add(b2);

        Developer chmaraDeveloper = new Developer("chmaraDeveloper", oferty, 15000000, 4.5);


        chmaraDeveloper.wypiszOfertyBudynkow();
        chmaraDeveloper.wypiszOfertyMieszkan();
        System.out.println(chmaraDeveloper.podajLacznaWartoscInwestycjiNetto());
        System.out.println(chmaraDeveloper.podajLacznaWartoscInwestycjiBrutto());


    }


}
