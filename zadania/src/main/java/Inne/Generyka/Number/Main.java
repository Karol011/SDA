package Inne.Generyka.Number;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(12, 115.3));
    }

    static <T extends Number> double  sum (T value1, T value2){
        return value1.doubleValue() + value2.doubleValue();
    }
}
/*
4. Stwórz metodę generyczną która dla dowolnych dwóch parametrów
(dziedziczących po klasie Number (wykorzystaj metodę generyczną ze słówkiem extends) )
 zwraca ich sumę (jako double). Metoda ma przyjmować dwie liczby typu T i zwracać wynik typu double
 */
