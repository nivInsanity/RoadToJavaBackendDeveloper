import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber > 99 || firstNumber < 10 ||
            secondNumber > 99 || secondNumber < 10) {
            return false;
        }

        Set<Integer> digits1 = new HashSet<>();
        digits1.add(firstNumber / 10);
        digits1.add(firstNumber % 10);

        Set<Integer> digits2 = new HashSet<>();
        digits2.add(secondNumber / 10);
        digits2.add(secondNumber % 10);

        return !(Collections.disjoint(digits1, digits2));
    }
}
