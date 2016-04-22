package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public class Crunchy implements Pizza {
    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public boolean isHot() {
        return false;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }
}
