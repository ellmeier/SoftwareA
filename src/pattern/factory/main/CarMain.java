package pattern.factory.main;

import pattern.factory.Car;
import pattern.factory.Factory;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-29
 */
public class CarMain {
    public static void main(String... args) {
        Factory factory = new Factory();

        Collection<Car> cars = Stream.of(args)
                .map(factory::make)
                .collect(Collectors.toList());

        cars.forEach(car -> {
            System.out.println(car);
            System.out.println(car.drive());
        });
    }
}
