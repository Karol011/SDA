package listopad24.kolo;

public class Main {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(5);
        kolo.obliczPole();
        System.out.println(kolo.getPromien());
        MojeKolo okrag = new MojeKolo(3);
        okrag.obliczPole();
    }
}
