package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class K70 {
    private final String maker = "VW";
    private final String model = "K70";
    private int kilometers;

    public K70 drive() {
        System.out.println("uiuiuiuifnnnnnn-krack...");
        kilometers += 110;
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
