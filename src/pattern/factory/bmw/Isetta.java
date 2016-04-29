package pattern.factory.bmw;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Isetta extends BMWCar {
    public Isetta() {
        super("Isetta");
    }

    public Isetta drive() {
        System.out.println("knatter-knatter-knatter ...");
        addKilometers(75);
        return this;
    }
}
