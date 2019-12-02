package listopad23.Enumy;

public enum Bilet {

    ULGOWY_GODZINNY(2.00d, 1),
    ULGOWY_CALODONIOWY(10.00d, 24),
    NORMALNY_GODZINNY(3.00d, 1),
    NORMALNY_CALODNIOWY(20.00d, 24),
    BRAK_BILETU(0d, 0);

    private double cena;
    private int czasJAzdy;

    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJAzdy = czasJazdy;
    }

    public double getCena() {
        return cena;
    }

    public int getCzasJazdy() {
        return czasJAzdy;
    }

    public void wyswietlDaneOBilecie(double cena, int czasJAzdy) {
        System.out.println(Bilet.this + " \ncena: " + getCena() + "\n" + getCzasJazdy() + "-godzinny");
    }

    public static Bilet kupBilet(int wiek, int czasJAzdy, int kwota) {

        if (kwota > 2) {
            if (wiek < 18) {
                if (czasJAzdy > 1) {
                    return Bilet.ULGOWY_CALODONIOWY;
                } else {
                    return Bilet.ULGOWY_GODZINNY;
                }

            } else {
                if (czasJAzdy > 1) {
                    return Bilet.NORMALNY_CALODNIOWY;
                } else {
                    return Bilet.NORMALNY_CALODNIOWY;
                }
            }
        }
        return Bilet.BRAK_BILETU;
    }
}

