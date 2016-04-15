package idiom.condwait;

import static idiom.condwait.Operation6.*;
import static idiom.condwait.ThreadLog.println;

public class OperationsSequential {
    public static void main(String... args) {
        init(args);
        Object monitor = new Object();
        Runnable runAs = () -> {
            a1.exec();
            synchronized(monitor) {
                a2.exec();
                monitor.notify();
                println("notified");
            }
            a3.exec();
        };
        Runnable runBs = () -> {
            b1.exec();
            try {
                synchronized(monitor) {
                    println("waiting ...");
                    monitor.wait();
                    println("woke up");
                    b2.exec();
                }
            } catch(InterruptedException e) {
                throw new AssertionError(e);
            }
            b3.exec();
        };
        new Thread(runAs).start();
        new Thread(runBs).start();
    }
}
