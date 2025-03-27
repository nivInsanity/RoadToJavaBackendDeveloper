import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayChallenge {

    public static Integer[] sortRandomlyGeneratedArray(int len) {
        Random random = new Random();
        Integer[] newInt = new Integer[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        Arrays.sort(newInt, Collections.reverseOrder());

        return newInt;
    }

}
