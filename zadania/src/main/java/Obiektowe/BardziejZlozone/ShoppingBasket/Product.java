package Obiektowe.BardziejZlozone.ShoppingBasket;

class Product {
    private String name;
    private double netPrice;
    private ProductBill vat;


     Product(String name, double netPrice, ProductBill vat) {
        this.name = name;
        this.netPrice = netPrice;
        this.vat = vat;
    }

    double giveBruttoPrice() {
        return getNetPrice() + (getNetPrice() * vat.getRate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    ProductBill getVat() {
        return vat;
    }


}
