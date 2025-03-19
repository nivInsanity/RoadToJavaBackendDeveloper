package BurgerChallenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealOrder {
    private DeluxeBurger deluxeBurger;
    private Burger burger;
    private Side side;
    private Beverage beverage;

    public MealOrder(Burger burger, Side side, Beverage beverage) {
        this.burger = burger;
        this.side = side;
        this.beverage = beverage;
    }

    public MealOrder(DeluxeBurger deluxeBurger, Side side, Beverage beverage) {
        this.deluxeBurger = deluxeBurger;
        this.side = side;
        this.beverage = beverage;
    }

    public String PrintSummary() {
        //TODO: complete summary printing method
        return "some text";
    }

}
