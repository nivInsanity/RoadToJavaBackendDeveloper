public class MethodOverloadingExercise {

    public static double convertToCentimeters (int heightInInches) {

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters (int heighInFeet, int heightInInches) {

        return convertToCentimeters((heighInFeet * 12) + heightInInches);
    }
}
