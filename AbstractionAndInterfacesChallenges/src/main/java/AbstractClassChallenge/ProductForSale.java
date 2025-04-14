package AbstractClassChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ProductForSale {
    private String type;
    private BigDecimal price;
    private String description;

    public BigDecimal getSalesPrice(int quantity) {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%d quantity of item %s has a price of %f", quantity, type, getSalesPrice(quantity));
    }

    public abstract void showDetails();
}

