package pattern.factory.bmw;

import pattern.factory.Car;
import pattern.factory.Factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class BMWFactory implements Factory {
    public Car make(String type) {
        switch(type) {
            case "Isetta":
                return new Isetta();
            case "Z8":
                return new Z8();
            default:
                return null;
        }
    }
}
