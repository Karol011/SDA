package PetleTablice.ZadaniaPodstawy;

/*
Zadanie 3. Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
 W programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu wypisywać
 na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
 do 85528 podatek wynosi 18% podstawy minus 556,02 PLN,
od 85528 podatek wynosi 14839,02 zł + 32% nadwyżki ponad 85528,00

 */
public class zadanie3 {
    public static void main(String[] args) {
        double dochod = 100000, podatek = 0;
        if (dochod < 85528) {
            podatek = (dochod * 0.18) - 562.02;
        } else if (dochod > 85528) {
            podatek = ((dochod - 85528)*0.32) + 14839.02;

        }
        System.out.println("podatek wyniesie = " + podatek);
    }
}
