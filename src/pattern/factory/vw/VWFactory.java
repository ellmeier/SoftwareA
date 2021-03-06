package pattern.factory.vw;

import pattern.factory.Car;
import pattern.factory.Factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class VWFactory implements Factory {
    public Car make(String type) {
        switch(type) {
            case "Golf":
                return new Golf();
            case "K70":
                return new K70();
            default:
                return null;
        }
    }
}
