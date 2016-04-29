package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Factory {
    public Car make(String type) {
        switch(type) {
            case "Isetta":
                return new Isetta();
            case "Z8":
                return new Z8();
            case "Golf":
                return new Golf();
            case "K70":
                return new K70();
            default:
                return null;
        }
    }
}
