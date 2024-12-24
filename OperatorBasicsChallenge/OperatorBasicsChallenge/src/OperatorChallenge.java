

public class OperatorChallenge {

    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double Result = (firstValue + secondValue) * 100.00;
        double ResultRemainder = Result % 40.00;

        System.out.println("Remainder of Result and 40.00 is: " + ResultRemainder);

        boolean checkResultZero = ResultRemainder == 0;

        System.out.println(checkResultZero);

        if (!checkResultZero) {
            System.out.println("got some remainder");
        }

    }
}
