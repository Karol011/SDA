package Inne.Generyka;


/*
1. Stwórz statyczną metodę generyczną, która 10 razy wypisuje na ekran metodę toString podanego parametru - obiektu podanego jako argument metody.

* stwórz metodę generyczną ze zmienną ilością argumentów (varargs) która wykonuje pętle przez wszystkie obiekty
z parametru i wypisuje je na ekran metodą toString().

 */
public class TypeToString10Times {

    static <T> void displayToString(T t) {
        for (int i = 0; i < 10; i++) {
            System.out.println(t.toString());
        }    }
    static <T> void displayToString(T... t) {
        for (T elements :t) {
            System.out.println(elements.toString());
        }
    }


    public static void main(String[] args) {
        displayToString(12345);
        displayToString("szafa graaaa",10,'t',12.3D);
    }

}
