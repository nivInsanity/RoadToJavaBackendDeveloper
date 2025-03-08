public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        return goal - (Math.min(bigCount, goal / 5) * 5) <= smallCount;

    }
}
