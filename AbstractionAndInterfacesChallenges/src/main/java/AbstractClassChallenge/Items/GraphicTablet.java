package AbstractClassChallenge.Items;

import AbstractClassChallenge.MainMethods.ProductForSale;

import java.math.BigDecimal;

public class GraphicTablet extends ProductForSale {
    public GraphicTablet(String type, BigDecimal price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Graphic tablet: " + getDescription() + " - " + getPrice() + " PLN");
    }
}
