package WzorceProjektowe.Factory;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Charset jakiesKodowanie = Charset.forName("UTF-8");
        System.out.println(jakiesKodowanie);

        ExecutorService pool = Executors.newFixedThreadPool(4);

        PojazdSpalinowy pojazd = WytworniaPojazdowSpalinowych.wyprodukujPojazd("Yamacha", "Różowy");

        pojazd.jedz();
        System.out.println(pojazd.getVin());

        new ArrayList<String>();
    }
}
