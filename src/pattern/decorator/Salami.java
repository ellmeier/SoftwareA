package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Salami extends  Topping {
    public Salami(Pizza restPizza) {
        super(restPizza);
    }

    @Override
    public int getPrice() {
        return 190 + super.getPrice();
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }
}
