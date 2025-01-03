public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int calculatedPosition = calculateHighScorePosition(90);
        displayHighScorePosition("Tom", calculatedPosition);

    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {

        String formatedMessage = String.format("%s managed to get into position %d on the high score list.", playerName, playerPosition);

        System.out.println(formatedMessage);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;

        if (playerScore >= 1000) {
            result = 1;
        }
        else if (playerScore < 1000 && playerScore >= 500) {
            result = 2;
        }
        else if (playerScore < 500 && playerScore >= 100) {
            result = 3;
        }
        else {
            result = 4;
        }

        return result;
    }
}

