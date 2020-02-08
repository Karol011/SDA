package Zgapa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {


        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }


        String str = "dluuuuugi randomowy striiiiing";
        long number = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> c.equals('i'))
                .count();
        System.out.println("ilosc = "+number);

        str.chars()
                .mapToObj(c -> (char)c)
                .forEach(System.out::println);
    }




}

