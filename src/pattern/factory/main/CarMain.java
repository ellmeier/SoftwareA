package pattern.factory.main;

import pattern.factory.Isetta;
import pattern.factory.Z8;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class CarMain {
    public static void main(String... args) {
        Isetta isetta = new Isetta();
        Z8 z8 = new Z8();

        System.out.println(isetta);
        System.out.println(isetta.drive());
        System.out.println(z8);
        System.out.println(z8.drive());
    }
}
