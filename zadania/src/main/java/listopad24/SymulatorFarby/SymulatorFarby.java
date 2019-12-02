package listopad24.SymulatorFarby;

public class SymulatorFarby {

    public static int obliczZapotrzebowanieNaFarbe(Figura[] figura, double wielkoscPojemnikaNaFarbe) {
        double sumaPolFigur=0;
        for (int i = 0; i < figura.length; i++) {
            sumaPolFigur += figura[i].obliczPole();
        }
        int iloscPuszekNaFarbe = ((int) Math.ceil(sumaPolFigur/wielkoscPojemnikaNaFarbe));
        return iloscPuszekNaFarbe;
    }
}
