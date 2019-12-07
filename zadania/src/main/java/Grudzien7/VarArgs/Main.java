package Grudzien7.VarArgs;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(dodaj(5, 6, 7, 22));


    }

    static int dodaj(int... args) {
        int wynik = 0;
        for (int i = 0; i < args.length; i++) {
            wynik += args[i];
        }
        return wynik;
    }
}
