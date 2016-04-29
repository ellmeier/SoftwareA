package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Z8 extends Car {
    public Z8() {
        super("BWM", "Z8");
    }

    public Z8 drive() {
        System.out.println("VROOOOOM ...");
        addKilometers(200);
        return this;
    }
}
