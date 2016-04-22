package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class PizzaApp {
    public static void main(String... args) {
        Pizza pizza = new Cheese(new Cheese(new Crunchy()));

        System.out.println(pizza.getPrice());
        System.out.println(pizza.isHot());
        System.out.println(pizza.isVegetarian());
    }
}
