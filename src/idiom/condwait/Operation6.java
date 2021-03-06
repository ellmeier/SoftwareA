package idiom.condwait;

import static idiom.condwait.ThreadLog.printf;
import static java.lang.Math.min;

public enum Operation6 {
    a1, a2, a3, b1, b2, b3;

    private int duration;

    static void init(final String... args) {
        int arg = 0;
        if(args.length == 0)
            init("1000");
        else
            for(Operation6 operation : values())
                operation.duration = Integer.parseInt(args[min(arg++, args.length - 1)]);
    }

    public void exec() {
        try {
            printf("=> %s%n", this);
            Thread.sleep(duration);
            duration = -1;  // Nur 1 Aufruf erlaubt; naechster Aufruf unzulaessiges Argument fuer sleep
            printf("<= %s%n", this);
        } catch(InterruptedException interruptedException) {
            throw new AssertionError(interruptedException);
        }
    }
}
