package patterns.factory;

import java.util.List;

public class ChocolatePizza extends Pizza {
    protected ChocolatePizza() {
        this.ingredients = List.of(
                new Ingredient("Chocolate"),
                new Ingredient("Creme de Leite"),
                new Ingredient("Raspas de chocolate")
        );
    }
}
