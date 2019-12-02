package listopad24.Biblioteka;

public class Biblioteka {
    Egzemplarz[] egzemplarze;


    public void szukajPoTytule(String tytul) {
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].tytul.equals(tytul)) {
                System.out.println(egzemplarze[i].numerEgzemplarza);
            }
        }
    }

    public void szukajPoAutorze(String imie) {
        for (int i = 0; i < egzemplarze.length; i++) {
            if (egzemplarze[i].imie.equals(imie)) {
                System.out.println(egzemplarze[i].numerEgzemplarza);
            }
        }
    }
}
