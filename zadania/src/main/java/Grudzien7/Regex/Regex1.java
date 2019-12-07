package Grudzien7.Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {

        String s = "ala ma kota";
        Pattern pattern = Pattern.compile("Ala ma kota");
        Matcher matcher = pattern.matcher("ma");

        System.out.println(matcher);


        String patternik = "\\s\\D[a-m]\\s";
        System.out.println(s.replaceAll(patternik, " posiada "));
        String nowyString = s.replaceAll("\\s\\D[a-m]\\s", " ram pam pam pam ");
        System.out.println(nowyString);

        System.out.println(usunSamogloski("Ala ma kota"));
zamianaWyrazuZDuzejLitery("ala","koala");
    }

    static String usunSamogloski(String wyraz) {
        String  wyrazBezSamoglosek = wyraz.replaceAll("[aeiouy]", "");
        return wyrazBezSamoglosek;
    }

static void zamianaWyrazuZDuzejLitery(String... args ) {

        System.out.println(Arrays.toString(args));


}






}
