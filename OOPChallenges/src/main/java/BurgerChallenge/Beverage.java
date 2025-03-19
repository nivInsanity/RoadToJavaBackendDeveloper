package BurgerChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beverage extends Meal {
    private boolean straw;

    protected Beverage(String name) {
        super(name);
    }
}
