package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Palermo implements Pizza {
    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public boolean isHot() {
        return true;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }
}
