package Obiektowe.BardziejZlozone.ShoppingBasket;

import java.util.List;

 class Check {
   private List<Product> listOfProducts;

    Check(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    List<Product> getListOfProducts() {
        return listOfProducts;
    }

    void addProduct(Product product) {
        listOfProducts.add(product);
    }

    void printCheck() {
        double sum = 0;
        for (Product product : listOfProducts) {
            System.out.printf("Product: " + product.getName() +
                    " " + "%.2f" + "zl (" + product.getVat() + ")\n", product.giveBruttoPrice());
            sum += product.giveBruttoPrice();
        }
        System.out.printf("Total: %.2f zl", sum);
    }

    double priceToPayNetto() {
        return getListOfProducts().stream()
                .mapToDouble(product -> product.getNetPrice())
                .sum();
    }

    double priceToPayBrutto() {
        return getListOfProducts().stream()
                .mapToDouble(product -> product.giveBruttoPrice())
                .sum();
    }

    double priceToPayIFVat23() {
        return getListOfProducts().stream()
                .mapToDouble(product -> product.getNetPrice() + product.getNetPrice() * ProductBill.VAT23.getRate())
                .sum();
    }

    double priceToPayIFVat8() {
        return getListOfProducts().stream()
                .mapToDouble(product -> product.getNetPrice() + product.getNetPrice() * ProductBill.VAT8.getRate())
                .sum();
    }

}
