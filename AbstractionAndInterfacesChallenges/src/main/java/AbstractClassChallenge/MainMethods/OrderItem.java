package AbstractClassChallenge.MainMethods;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderItem {
    private int quantity;
    private ProductForSale productForSale;

    public void printLineItem() {
        productForSale.printPricedItem(quantity);
    }

    public BigDecimal getTotalPrice() {
        return productForSale.getSalesPrice(quantity);
    }
}

