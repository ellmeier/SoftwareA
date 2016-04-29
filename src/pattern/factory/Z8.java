package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Z8 {
    private final String maker = "BMW";
    private final String model = "Z8";
    private int kilometers;

    public Z8 drive() {
        System.out.println("VROOOOOM ...");
        kilometers += 200;
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
