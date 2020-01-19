package LambdyIStrumienie.Wyszukiwarka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {

        List<Komputer> komputeryWMagazynie = new ArrayList();
        komputeryWMagazynie.add(new Komputer("AMD", 4, 2.4, 15.6, "AMD", 240));
        komputeryWMagazynie.add(new Komputer("INTEL", 2, 3.2, 15.6, "NVIDIA", 360));
        komputeryWMagazynie.add(new Komputer("INTEL", 6, 3.0, 17.4, "NVIDIA", 700));
        komputeryWMagazynie.add(new Komputer("AMD", 8, 3.0, 14.6, "AMD", 540));

//        System.out.println(komputeryWMagazynie);
        String markaProcesora = wybierzProcesor();
        int iloscRdzeni = wybierzIloscRdzeni();
        double taktowanieProcesora = wybierzTaktowanieProcesora();
        double przekatnaEkranu = wybierzPrzekatnaEkranu();
        String kartaGraficzna = wybierzKarteGraficzna();
        int iluWatowyZasilacz = wybierzIluWatowyZasilacz();
        okreslKryteria();


        komputeryWMagazynie.stream()

                .filter(k -> k.getMarkaProcesora().equalsIgnoreCase(markaProcesora))
                .filter(k -> k.getIloscRdzeni() > iloscRdzeni)
                .filter(k -> k.getTaktowanieProcesora() > taktowanieProcesora)
                .filter(k -> k.getPrzekatnaEkranu() > przekatnaEkranu)
                .filter(k -> k.getKartaGraficzna().equalsIgnoreCase(kartaGraficzna))
                .filter(k -> k.getIluWatowyZasilacz() > iluWatowyZasilacz)
                .forEach(k -> System.out.println(k));
    }

    protected void zapytajOFiltry() {

    }



    private static String wybierzProcesor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("marka procesora? (AMD/INTEL)");
        String markaProcesora = scanner.nextLine();
        return markaProcesora;
    }

    private static int wybierzIloscRdzeni() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilosc rdzeni?");
        int iloscRdzeni = scanner.nextInt();
        return iloscRdzeni;
    }

    private static double wybierzTaktowanieProcesora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taktowanie procesora?");
        double taktowanie = scanner.nextDouble();
        return taktowanie;
    }

    private static double wybierzPrzekatnaEkranu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("przekarna ekranu?");
        double przekatna = scanner.nextDouble();
        return przekatna;
    }

    private static String wybierzKarteGraficzna() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("marka karty graficznej? (AMD/NVIDIA)");
        String markaKartyGraficznej = scanner.nextLine();
        return markaKartyGraficznej;
    }

    private static int wybierzIluWatowyZasilacz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilosc watow?");
        int iloscWatow = scanner.nextInt();
        return iloscWatow;
    }


    private static void okreslKryteria() {
        Scanner scanner = new Scanner(System.in);
        String wybierzDzialanie = scanner.nextLine();
        do {
            System.out.println("Co chcesz zdefiniowac?\n" +
                    "1:procesor AMD/INTEL\n" +
                    "2:ilosc rdzeni procesora\n" +
                    "3:taktowanie procesora\n" +
                    "4:przekatna ekranu\n" +
                    "5:karta graficzna\n" +
                    "6:ile watow ma miec zasilacz\n" +
                    "quit: konczy prace");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    wybierzProcesor();
                    break;
                case "2":
                    wybierzIloscRdzeni();
                    break;
                case "3":
                    wybierzTaktowanieProcesora();
                    break;
                case "4":
                    wybierzPrzekatnaEkranu();
                    break;
                case "5":
                    wybierzKarteGraficzna();
                    break;
                case "6":
                    wybierzIluWatowyZasilacz();
                    break;
            }
        } while (!wybierzDzialanie.equals("quit"));
    }

}
