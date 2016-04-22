package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Spice extends Topping {
    public Spice(Pizza restPizza) {
        super(restPizza);
    }

    @Override
    public boolean isHot() {
        return true;
    }
}
