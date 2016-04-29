package pattern.factory.bmw;

import pattern.factory.Car;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public abstract class BMWCar extends Car {
    public BMWCar(String model) {
        super("BMW", model);
    }
}
