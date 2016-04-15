package idiom.condwait;

import static idiom.condwait.ThreadLog.println;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-15
 */
public class DelayedWakeup {
    public static void main(String... args) throws InterruptedException {
        final Object monitor = new Object();
        final Runnable waiter = () -> {
            try {
                synchronized(monitor) {
                    println("enter synchronized");
                    println("=> wait");
                    monitor.wait();
                    println("<= wait");
                    println("exit synchronized");
                }
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        final Runnable notifier = () -> {
            try {
                synchronized(monitor) {
                    println("enter synchronized");
                    println("=> notifyAll");
                    monitor.notifyAll();
                    println("<= notifyAll");
                    println("exit synchronized");
                }
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        };

        new Thread(waiter).start();
        new Thread(waiter).start();
        new Thread(waiter).start();
        Thread.sleep(1_000);
        new Thread(notifier).start();

    }
}
