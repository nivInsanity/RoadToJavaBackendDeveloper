import java.util.List;

public class FindHighestValue {

    public static int highestValue (List<Integer> randomizedIntegers) {
        return randomizedIntegers.stream()
                                 .max(Integer::compareTo)
                                 .orElseThrow(() -> new IllegalArgumentException("List is empty!"));
    }
}
