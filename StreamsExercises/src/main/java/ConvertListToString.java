import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToString {
    public static String ListConverter (List<Integer> integers) {
    return integers.stream()
                   .map(String::valueOf)
                   .collect(Collectors.joining(", "));
    }
}
