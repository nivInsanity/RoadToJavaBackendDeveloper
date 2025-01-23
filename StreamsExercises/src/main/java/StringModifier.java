import java.util.List;
import java.util.stream.Collectors;

public class StringModifier {
    public static List<String> modifyStringToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}