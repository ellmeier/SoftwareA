package idiom.condwait;

import static idiom.condwait.Operation6.a1;
import static idiom.condwait.Operation6.init;

public class OperationsSequential {
    public static void main(String... args) {
        init(args);

        a1.exec();
    }
}
