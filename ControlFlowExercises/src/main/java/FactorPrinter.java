import java.util.ArrayList;

public class FactorPrinter {
    public static ArrayList<Integer> printFactors(int number) {
        int divider = 1;
        ArrayList<Integer> factorsList = new ArrayList<>();

        if (number < 1) {
            factorsList.add(-1);
        }

        while (divider <= number) {
            if (number % divider == 0) {
                factorsList.add(divider);
                divider++;
            } else {
                divider++;
            }
        }

        return factorsList;
    }
}