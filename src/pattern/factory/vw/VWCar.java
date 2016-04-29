package pattern.factory.vw;

import pattern.factory.Car;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public abstract class VWCar extends Car {
    public VWCar(String model) {
        super("VW", model);
    }
}
