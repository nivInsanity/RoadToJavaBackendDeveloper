import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringModifier {
    public static List<String> modifyStringToUpperCase(List<String> strings) {
        return strings.stream()
                      .map(String::toUpperCase)
                      .collect(Collectors.toList());
    }
}