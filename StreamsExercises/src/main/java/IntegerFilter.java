import java.util.List;

import java.util.stream.IntStream;

public class IntegerFilter {
    static List<Integer> integers = IntStream.rangeClosed(1, 20).boxed().toList();

    public static List<Integer> getEvenInteger() {
        return integers.stream().filter(n -> n % 2 == 0).toList();

    }
}


