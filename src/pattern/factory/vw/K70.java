package pattern.factory.vw;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class K70 extends VWCar {
    public K70() {
        super("K70");
    }

    public K70 drive() {
        System.out.println("uiuiuiuifnnnnnn-krack");
        addKilometers(110);
        return this;
    }
}
