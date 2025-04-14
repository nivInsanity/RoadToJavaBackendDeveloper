package AbstractClassChallenge.Items;

import AbstractClassChallenge.MainMethods.ProductForSale;

import java.math.BigDecimal;

public class MobilePhone extends ProductForSale {
    public MobilePhone(String type, BigDecimal price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Phone: " + getDescription() + " - " + getPrice() + " PLN");
    }
}
