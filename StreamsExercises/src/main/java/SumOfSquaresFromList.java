import java.util.List;

public class SumOfSquaresFromList {

    public static int squareIntegers(List<Integer> integers) {
        return integers.stream().map(n -> n * n).reduce(0, Integer::sum);
    }
}
