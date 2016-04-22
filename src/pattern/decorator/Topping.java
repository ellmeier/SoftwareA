package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public abstract class Topping implements Pizza {
    private final Pizza restPizza;

    public Topping(Pizza restPizza) {this.restPizza = restPizza;}

    @Override
    public int getPrice() {
        return restPizza.getPrice();
    }

    @Override
    public boolean isHot() {
        return restPizza.isHot();
    }

    @Override
    public boolean isVegetarian() {
        return restPizza.isVegetarian();
    }
}
