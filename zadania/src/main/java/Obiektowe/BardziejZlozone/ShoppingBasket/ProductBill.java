package Obiektowe.BardziejZlozone.ShoppingBasket;

public enum ProductBill {
    VAT5(0.05),
    VAT8(0.08),
    VAT23(0.23),
    NO_VAT(0);

    private double rate;

    ProductBill(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
