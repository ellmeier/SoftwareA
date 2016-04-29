package pattern.factory.main;

import pattern.factory.Isetta;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class CarMain {
    public static void main(String... args) {
        Isetta isetta = new Isetta();

        System.out.println(isetta);
        System.out.println(isetta.drive());
    }
}
