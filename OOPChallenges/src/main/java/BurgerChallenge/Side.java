package BurgerChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Side extends Meal {
    private final String sauce;

    protected Side(String name, String sauce, String sauce1) {
        super(name);
        this.sauce = sauce1;
    }
}
