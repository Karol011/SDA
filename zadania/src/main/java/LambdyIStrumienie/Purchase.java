package LambdyIStrumienie;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
class Purchase {             // klasa reprezentuje zakup
    private Product product;        // produkt zakupiony
    private LocalDate purchaseDate; // data dokonania zakupu
    private double quantity;        // zakupiona ilość produktu
    private UNIT unit;              // jednostka zakupu (np. w gramach)


    double getPriceOFAllProducts() {
        return getQuantity()*getProduct().getPrice();
    }


}
