package patterns.factory;

import java.util.List;

public class PepperoniPizza extends Pizza{

    protected PepperoniPizza() {
        this.ingredients = List.of(
                new Ingredient("Tomate"),
                new Ingredient("Queijo"),
                new Ingredient("Sal"),
                new Ingredient("Orégano"),
                new Ingredient("Calabresa"),
                new Ingredient("Cebola")
        );
    }
}
