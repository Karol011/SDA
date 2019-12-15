package Interfejsy.Klimatyzacja;

public class Farelka implements Grzeje {
    double temperatura;


    @Override
    public double pobierzTemp() {
        return 0;
    }

    @Override
    public void zwiekszTemp() {
        this.temperatura += 5;
    }
}
