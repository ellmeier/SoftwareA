package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Isetta extends Car {
    public Isetta() {
        super("BMW", "Isetta");
    }

    public Isetta drive() {
        System.out.println("knatter-knatter-knatter ...");
        addKilometers(75);
        return this;
    }
}
