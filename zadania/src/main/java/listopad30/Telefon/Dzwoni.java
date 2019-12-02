package listopad30.Telefon;

public interface Dzwoni {
    static String numerAlarmowy = "999";
    String dzwon = "dzwonie";

    int zadzwon(String dzwon);
    void zadzwonNaNumerAlarmowy(String numerAlarmowy);

}
