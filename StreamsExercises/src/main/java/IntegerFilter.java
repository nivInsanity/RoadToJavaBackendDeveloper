import java.util.List;

public class IntegerFilter {
    public static List<Integer> getEvenInteger(List<Integer> integers) {
        return integers.stream().filter(n -> n % 2 == 0).toList();

    }
}


