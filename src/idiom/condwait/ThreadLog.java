package idiom.condwait;

import java.util.ArrayList;
import java.util.List;

public class ThreadLog {
    private static long initialized = System.currentTimeMillis();

    private static long printLastCalled = Long.MAX_VALUE;

    private static List<Thread> threads = new ArrayList<>();

    private static final int TABWIDTH = 8;

    public synchronized static void reset() {
        initialized = System.currentTimeMillis();
        threads = new ArrayList<>();
    }

    public synchronized static void print(final String message) {
        Thread current = Thread.currentThread();
        if(!threads.contains(current))
            threads.add(current);
        final int column = threads.indexOf(current);
        final int indent = column*TABWIDTH + 1;
        final long now = System.currentTimeMillis();
        if(printLastCalled/1_000 < now/1_000)
            System.out.println("------");
        System.out.printf("%6d%" + indent + "s%s",
                          now - initialized,
                          "",
                          message);
        printLastCalled = now;
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
