package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Cheese implements Pizza {
    private final Pizza restPizza;

    public Cheese(Pizza restPizza) {
        this.restPizza = restPizza;
    }

    @Override
    public int getPrice() {
        return 100 + restPizza.getPrice();
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
