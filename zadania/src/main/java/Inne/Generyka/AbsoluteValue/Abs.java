package Inne.Generyka.AbsoluteValue;

public class Abs {

    static <T extends Number> void abs(T number) {
        if (number.doubleValue() > 0) {
            System.out.println("Absolute value = " + number.doubleValue());
        } else {
            System.out.println("Absolute value = " + number.doubleValue() * -1);

        }
        System.out.println("Opposite value " + number.doubleValue() * -1);
        System.out.println("Inverse value " + (1 / number.doubleValue()));
    }

    public static void main(String[] args) {
        abs(-13.7);
    }

    /*
    6. Stwórz statyczną metodę generyczną 'abs:T' która dla dowolnej liczby zwraca jej :
    - wartość bezwzględną.
    - wartość przeciwną,
    - wartość odwrotną

     */
}
