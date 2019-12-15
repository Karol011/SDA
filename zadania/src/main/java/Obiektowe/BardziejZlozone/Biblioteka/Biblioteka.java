package Obiektowe.BardziejZlozone.Biblioteka;

public class Biblioteka {
    Egzemplarz[] egzemplarze;
    Egzemplarz[] szukaneEgzemplarze;

    public Biblioteka(Egzemplarz[] egzemplarze) {
        this.egzemplarze = egzemplarze;
    }

    public Egzemplarz[] szukajPoTytule(String tytul) {
        Egzemplarz[] szukaneEgzemplarze = new Egzemplarz[20];
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].getTytul().equals(tytul)) {
                egzemplarze[i] = szukaneEgzemplarze[i];
            }
        }
        return szukaneEgzemplarze;
    }

    public void szukajPoAutorze(String imie) {
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].getImie().equals(imie)) {
                System.out.println(egzemplarze[i].getNumerEgzemplarza());
            }
        }
    }
}
