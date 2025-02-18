public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int resultNumber = 0;

        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {

                if (number % 2 == 0) {
                    if (number % 10 == 0) {
                        number = number / 10;
                    } else {
                        resultNumber += (number % 10);
                        number = number / 10;
                    }
                } else {
                    number = number / 10;
                }
            }

            return resultNumber;
        }
    }

}
