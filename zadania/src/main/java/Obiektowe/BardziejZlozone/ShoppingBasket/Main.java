package Obiektowe.BardziejZlozone.ShoppingBasket;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Check check = new Check(new ArrayList<>(Arrays.asList(
                new Product("Pizza", 30, ProductBill.VAT23),
                new Product("Apple", 1.2, ProductBill.VAT23),
                new Product("Wine", 78, ProductBill.VAT8),
                new Product("Hamburger", 12.5, ProductBill.VAT5),
                new Product("Tea", 2.5, ProductBill.VAT8),
                new Product("Coffee", 6, ProductBill.VAT5),
                new Product("Milk", 3, ProductBill.VAT23),
                new Product("Coconuts", 22, ProductBill.VAT23)
        )));
        System.out.println(check.getListOfProducts().get(3).giveBruttoPrice());
        System.out.println(check.getListOfProducts().get(3).getNetPrice());
        check.printCheck();
        System.out.println();
        System.out.println();
        System.out.println("total net price " + check.priceToPayNetto());
        System.out.printf("total brutto price %.2f \n", check.priceToPayBrutto());
        System.out.printf("price to pay if Vat23 %.2f\n",check.priceToPayIFVat23());
        System.out.printf("price to pay if Vat8 %.2f",check.priceToPayIFVat8());
    }

}
/*
Zadanie 1:
Stworzymy koszyk zakupowy z produktami. Nasz koszyk będzie przechowywał zamówienie które możemy złożyć w pizzerii lub restauracji (lub sklepie).

Stwórz enum PodatekProduktu i dodaj wartości:
VAT8
VAT23
VAT5
NO_VAT

Stwórz klasę Produkt. Dodaj w niej pola:
- nazwa produktu
- cena produktu (netto)
- ilość podatku (PodatekProduktu)

Dodaj w klasie produkt metody:
- gettery oraz settery do wszystkich pól
- metodę podajCeneBrutto():double - która oblicza cenę brutto na podstawie ceny netto i nałożonego podatku

Stwórz klasę Rachunek który jako pola posiada:
- listę zakupionych produktów

Dodaj w klasie Rachunek metody:
- getter do listy zakupionych produktów
- metodę dodajProdukt(Produkt):void - która dodaje produkt podany w parametrze (metoda niezbędna do testowania aplikacji z Main’a.
- wypiszRachunek():void - metoda która wypisuje do konsoli wszystkie produkty z listy jeden pod drugim.
- podsumujRachunekNetto():double - która oblicza sumę cen netto i ZWRACA tą wartość
- podsumujRachunekBrutto():double - która oblicza sumę cen brutto i ZWRACA tą wartość
- zwróćWartośćPodatku():double - która ZWRACA różnicę między cenami netto i brutto

Dodatkowe:
** - stwórz metodę która zwróci informację o tym ile kosztowałyby wszystkie produkty gdyby posiadały podatek 8%, oraz gdyby posiadały podatek 23%.


Wskazówka: do enuma dodaj wartość liczbową reprezentującą wartość (procentowo) podatku.

 */