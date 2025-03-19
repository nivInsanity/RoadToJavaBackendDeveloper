package BurgerChallenge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeluxeBurger extends Meal{
    private Meal extraTopping;
    private Meal extraTopping2;
    private Meal extraTopping3;
    private Meal extraTopping4;
    private Meal extraTopping5;


    protected DeluxeBurger(String name) {
        super(name);
    }
}
