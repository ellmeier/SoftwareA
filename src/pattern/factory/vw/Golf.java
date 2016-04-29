package pattern.factory.vw;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Golf extends VWCar {
    public Golf() {
        super("Golf");
    }

    public Golf drive() {
        System.out.println("golf, golf, golf");
        addKilometers(140);
        return this;
    }
}
