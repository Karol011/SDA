package listopad24.Zajezdnia;

public class ZajezdniaTramwajowa extends Zajezdnia {
    Tramwaj[] tramwaj;

    public ZajezdniaTramwajowa(String nazwaZajezdni, Pojazd[] pojazdy) {
        super(nazwaZajezdni, pojazdy);
    }

    public int calkowitaIloscWagonow() {
        int ilosc = 0;
        for (int i = 0; i < tramwaj.length; i++) {
            ilosc += tramwaj[i].liczbaWagonow;
        }
        return ilosc;
    }

    @Override
    public String toString() {
        return super.toString() +
                " laczna ilosc wagonow: ";// + calkowitaIloscWagonow();
    }
}
