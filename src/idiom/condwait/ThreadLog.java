package idiom.condwait;

import java.util.ArrayList;
import java.util.List;

/**
 * @author R. Schiedermeier, rs@cs.hm.edu
 * @version 2016-04-15
 */
public class ThreadLog {
    private static long created = System.currentTimeMillis();

    private static List<Thread> threads = new ArrayList<>();

    private static final int TABWIDTH = 8;

    public synchronized static void reset() {
        created = System.currentTimeMillis();
        threads = new ArrayList<>();
    }

    public synchronized static void print(final String message) {
        Thread current = Thread.currentThread();
        if(!threads.contains(current))
            threads.add(current);
        final int column = threads.indexOf(current);
        final int indent = column*TABWIDTH + 1;
        System.out.printf("%5d%" + indent + "s%s",
                          System.currentTimeMillis() - created,
                          "",
                          message);
    }

    public synchronized static void println(final String message) {
        print(message);
        System.out.println();
    }

    public synchronized static void printf(final String format, final Object... args) {
        print("");
        System.out.printf(format, args);
    }
}
