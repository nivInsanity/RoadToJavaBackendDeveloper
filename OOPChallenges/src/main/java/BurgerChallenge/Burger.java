package BurgerChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Burger extends Meal{
    private Meal extraTopping;
    private Meal extraTopping2;
    private Meal extraTopping3;

    protected Burger(String name) {
        super(name);
    }
}
