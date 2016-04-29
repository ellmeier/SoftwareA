package pattern.factory;

import pattern.factory.bmw.BMWFactory;
import pattern.factory.vw.VWFactory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public interface Factory {
    Car make(String model);

    static Factory get() {
        String factorytype = System.getProperty("factory.type");
        switch(factorytype) {
            case "VWFactory":
                return new VWFactory();
            case "BWMFactory":
                return new BMWFactory();
            default:
                throw new IllegalArgumentException("unknown factory type: " + factorytype);
        }
    }
}
