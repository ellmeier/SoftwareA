package idiom.condwait;

import static idiom.condwait.ThreadLog.println;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-15
 */
public class ProducerConsumer {
    private static int resource = 0;

    public static void main(String... args) throws InterruptedException {
        final Object monitor = new Object();
        Runnable producer = () -> {
            try {
                while(!Thread.interrupted()) {
                    // produce number
                    println("producing ...");
                    int number = (int)(Math.random()*1000) + 1;
                    Thread.sleep(number);
                    println("produced " + number);

                    // send number
                    resource = number;
                }
            } catch(InterruptedException e) {
                println("interrupted");
            }
        };
        Runnable consumer = () -> {
            try {
                while(!Thread.interrupted()) {
                    // receive number
                    int number = resource;

                    // consume number
                    println("consumed " + number);
                }
            } catch(Exception e) {
                println("interrupted");
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(5_000);
        Thread.currentThread().getThreadGroup().interrupt();

    }
}
