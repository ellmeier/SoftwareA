package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class Isetta {
    private final String maker = "BMW";
    private final String model = "Isetta";
    private int kilometers;

    public Isetta drive() {
        System.out.println("knatter-knatter-knatter ...");
        kilometers += 75;
        return this;
    }

    public int getKilometers() {
        return kilometers;
    }

    @Override
    public String toString() {
        return "Isetta{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", kilometers=" + kilometers +
                '}';
    }
}
