package AbstractClassChallenge.MainMethods;

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
        System.out.printf("%d x %s @ %.2f = %.2f PLN\n",
                quantity,
                type,
                price.doubleValue(),
                getSalesPrice(quantity).doubleValue());
    }

    public abstract void showDetails();
}

