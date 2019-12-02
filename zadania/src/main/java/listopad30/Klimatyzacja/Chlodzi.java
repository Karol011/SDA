package listopad30.Klimatyzacja;

public interface Chlodzi {

    double pobierzTemp();

    void schlodz();
    default void wyswietlTemp(){
        System.out.println("aktualna temperatura w pomieszczeniu wynosi: " + pobierzTemp());
    }
}
