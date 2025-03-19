package BurgerChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Meal {
    private final String name;
    private String type;
    private BigDecimal price;
    private int quantity;
    private int size;

    protected Meal(String name) {
        this.name = name;
    }
}
