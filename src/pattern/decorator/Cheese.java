package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Cheese extends Topping {

    public Cheese(Pizza restPizza) {
        super(restPizza);
    }

    @Override
    public int getPrice() {
        return 100 + super.getPrice();
    }
}
