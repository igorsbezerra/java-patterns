package patterns.factory;

public class MainFactory {

    public static void main(String[] args) {
        var pizza = PizzaFactory.getInstance(true);
        var pizza2 = PizzaFactory.getInstance(false);

        System.out.println(pizza);
        System.out.println(pizza2);
    }
}
