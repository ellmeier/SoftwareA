package pattern.factory.main;

import pattern.factory.*;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class CarMain {
    public static void main(String... args) {
        Isetta isetta = new Isetta();
        Z8 z8 = new Z8();
        Golf golf = new Golf();
        K70 k70 = new K70();

        System.out.println(isetta);
        System.out.println(isetta.drive());
        System.out.println(z8);
        System.out.println(z8.drive());
        System.out.println(golf);
        System.out.println(golf.drive());
        System.out.println(k70);
        System.out.println(k70.drive());
    }
}
