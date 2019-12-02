package listopad30.Telefon;

import java.util.Random;

public class Telefon implements Dzwoni {
    String numerTelefonu;
    int lacznyCzasRozmow;

    Telefon telefon = new Telefon();
    @Override
    public int zadzwon(String numerTelefonu) {
        Random random = new Random();
        int czasRozmowy = 0;
        int szansa = random.nextInt(100) + 1;
        if (szansa > 50) {
            System.out.println("dzwonie na " + numerTelefonu);
            czasRozmowy = random.nextInt(60) + 1;
        } else {
            System.out.println("probowalem sie dodzwonic ale bylo zajete");
        }
        System.out.println("polaczenie trwalo: ");

        return czasRozmowy;
    }

    @Override
    public void zadzwonNaNumerAlarmowy(String numerTelefonu) {
        zadzwon(this.numerAlarmowy);
    }


}
