import java.util.ArrayList;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int divider = 1;
        ArrayList<Integer> factorsList = new ArrayList<>();


        while (divider <= number) {
            if (number % divider == 0) {
                factorsList.add(divider);
                divider++;
            } else {
                divider++;
            }
        }
        int largestPrime = -1;
        for (int factor : factorsList) {
            boolean isPrime = true;
            if (factor > 1) {
                for (int i = 2; i <= Math.sqrt(factor); i++) {
                    if (factor % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && factor > largestPrime) {
                    largestPrime = factor;
                }
            }
        }
        return largestPrime;
    }

}