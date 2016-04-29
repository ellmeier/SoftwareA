package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Golf {
    private final String maker = "VW";
    private final String model = "Golf";
    private int kilometers;

    public Golf drive() {
        System.out.println("golf, golf, golf");
        kilometers += 140;
        return this;
    }

    public int getKilometers() {
        return kilometers;
    }

    @Override
    public String toString() {
        return  maker + ' ' + model + ", kilometers=" + kilometers;
    }
}
