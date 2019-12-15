package Obiektowe.ZadaniaDomoweObiektyInterfejsy.Zadanie6;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
 class Developer {
    String nazwa;
    List<Budynek> oferty = new ArrayList<>();
    double kapitalZakladowy;
    double ocenaDevelopera;

    void wypiszOfertyBudynkow() {
        for (Budynek budynek : oferty) {
            budynek.wypiszOferte();
        }

    }

    void wypiszOfertyMieszkan() {
        for (Budynek budynek : oferty) {
            budynek.wypiszOferte();
            for (Budynek mieszkania :
                    oferty) {
                System.out.println(Arrays.toString(mieszkania.getOfertyMieszkan()));
            }
        }
    }

    double podajLacznaWartoscInwestycjiNetto() {
        double lacznaCenaBudynkow=0;
        for (Budynek budynek: oferty
             ) {
           lacznaCenaBudynkow+= budynek.lacznaWartoscBudynkuNetto();
        }
        return lacznaCenaBudynkow;
    }
    double podajLacznaWartoscInwestycjiBrutto() {
        double lacznaCenaBudynkow=0;
        for (Budynek budynek: oferty
        ) {
            lacznaCenaBudynkow+= budynek.podajLacznaWartoscBudynkuBrutto();
        }
        return lacznaCenaBudynkow;
    }


/*


            - wypiszOfertyBudynków():void (wypisuje opisy budynków w nowych liniach, ale bez opisów mieszkań)
- wypiszOfertyMieszkań():void (wypisuje opisy budynków w nowych liniach i opisów mieszkań)
- podajŁącznąWartośćInwestycjiBrutto():double - zwraca sume brutto wartości budynków
- podajŁącznąWartośćInwestycjiNetto():double - zwraca sume netto wartości budynków
*/


}
