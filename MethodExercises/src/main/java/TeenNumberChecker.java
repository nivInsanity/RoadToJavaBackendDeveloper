public class TeenNumberChecker {
    public static boolean hasTeen (int firstParam, int secondParam, int thirdParam) {
        return (firstParam >= 13 && firstParam <= 19) ||
               (secondParam >= 13 && secondParam <= 19) ||
               (thirdParam >= 13 && thirdParam <= 19);
    }

    public static boolean isTeen (int param) {
        return (param >= 13 && param <= 19);
    }
}
