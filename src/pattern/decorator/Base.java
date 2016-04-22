package pattern.decorator;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-22
 */
public enum Base implements Pizza {
    Crunchy(300, false), Palermo(400, true), Fluffy(450, false);

    private int price;
    private boolean isHot;

    Base(int price, boolean isHot) {
        this.price = price;
        this.isHot = isHot;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isHot() {
        return isHot;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }


}
