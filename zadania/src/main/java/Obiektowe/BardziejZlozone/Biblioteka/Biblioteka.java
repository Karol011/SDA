package Obiektowe.BardziejZlozone.Biblioteka;

public class Biblioteka {
    Egzemplarz[] egzemplarze;

    public Biblioteka(Egzemplarz[] egzemplarze) {
        this.egzemplarze = egzemplarze;
    }

    public Egzemplarz[] szukajPoTytule(String tytul) {
        int licznik=0;
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].getTytul().equalsIgnoreCase(tytul)) {
                licznik++;
            }
        }
        Egzemplarz[] szukaneEgzemplarze = new Egzemplarz[licznik];
        int j=0;
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].getTytul().equalsIgnoreCase(tytul)) {
                szukaneEgzemplarze[j] = egzemplarze[i];
                j++;
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
