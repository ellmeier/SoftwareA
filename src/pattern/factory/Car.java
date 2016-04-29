package pattern.factory;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public abstract class Car {
    private final String maker;
    private final String model;
    private int kilometers;

    Car(String maker, String model) {
        this.maker = maker;
        this.model = model;
    }

    public abstract Car drive();

    public int getKilometers() {
        return kilometers;
    }

    void addKilometers(int kilometers) {
        this.kilometers += kilometers;
    }

    @Override
    public String toString() {
        return maker + ' ' + model + ", kilometers=" + kilometers;
    }
}
