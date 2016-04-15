package idiom.condwait;

import static idiom.condwait.Operation6.*;
import static idiom.condwait.ThreadLog.println;

public class OperationsSequential {
    private static boolean ready = false;

    public static void main(String... args) {
        init(args);
        Object monitor = new Object();
        Runnable runAs = () -> {
            a1.exec();
            a2.exec();
            synchronized(monitor) {
                ready = true;
                monitor.notify();
                println("notified");
            }
            a3.exec();
        };
        Runnable runBs = () -> {
            b1.exec();
            try {
                synchronized(monitor) {
                    if(!ready) {
                        Thread.sleep(200);
                        println("waiting ...");
                        monitor.wait();
                        println("woke up");
                    }
                }
            } catch(InterruptedException e) {
                throw new AssertionError(e);
            }
            b2.exec();
            b3.exec();
        };
        new Thread(runAs).start();
        new Thread(runBs).start();
    }
}
