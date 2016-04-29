package pattern.factory.main;

import pattern.factory.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class CarMain {
    public static void main(String... args) {
        Collection<Car> cars = Arrays.asList(new Isetta(),
                                             new Z8(),
                                             new Golf(),
                                             new K70());
        cars.forEach(car -> {
            System.out.println(car);
            System.out.println(car.drive());
        });
    }
}
