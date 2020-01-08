package LambdyIStrumienie;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Company {
    private String name; // nazwa firmy
    private String cityHeadquarters; // siedziba firmy
    private int employees; // ilość pracowników
    private List<Purchase> purchaseList; // lista zakupów wykonanych przez firmę (co firma kupiła)

    public Company(String name, String cityHeadquarters, int employees, List<Purchase> purchaseList) {
        this.name = name;
        this.cityHeadquarters = cityHeadquarters;
        this.employees = employees;
        this.purchaseList = purchaseList;
    }
}

