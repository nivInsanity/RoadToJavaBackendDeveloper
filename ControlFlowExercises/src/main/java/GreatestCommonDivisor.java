import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        Set<Integer> divisors1 = new HashSet<>();
        Set<Integer> divisors2 = new HashSet<>();

        if (first < 10 || second < 10) {
            return -1;
        }

        for (int divider = 1; divider <= first; divider++) {
            if (first % divider == 0) {
                divisors1.add(divider);
            }
        }

        for (int divider = 1; divider <= second; divider++) {
            if (second % divider == 0) {
                divisors2.add(divider);
            }
        }

        divisors1.retainAll(divisors2);

        return Collections.max(divisors1);
    }
}
