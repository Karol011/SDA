package Interfejsy.Telefon;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
       System.out.println(telefon.zadzwon("511100200"));
        telefon.zadzwonNaNumerAlarmowy();
    }
}
