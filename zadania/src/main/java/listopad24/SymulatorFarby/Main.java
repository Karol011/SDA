package listopad24.SymulatorFarby;

public class Main {
    public static void main(String[] args) {
        Figura kolo = new Kolo(5);
        Figura prostokat = new Prostokat(10, 20);
        Figura kwadrat = new Kwadrat(10);

        Figura[] tablicaFigur = {kolo, prostokat, kwadrat};
        System.out.println(SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicaFigur,10));

    }
}
