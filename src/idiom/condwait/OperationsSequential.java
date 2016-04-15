package idiom.condwait;

import static idiom.condwait.Operation6.*;

public class OperationsSequential {
    public static void main(String... args) {
        init(args);
        Runnable runAs = () -> {
            a1.exec();
            a2.exec();
            a3.exec();
        };
        Runnable runBs = () -> {
            b1.exec();
            b2.exec();
            b3.exec();
        };
        new Thread(runAs).start();
        new Thread(runBs).start();
    }
}
