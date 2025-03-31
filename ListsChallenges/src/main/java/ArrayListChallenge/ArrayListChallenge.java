package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner scanner = new Scanner(System.in);

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item (When more than one - comma separated):\n");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmed = item.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item (When more than one - comma separated):\n");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
    }

    public static void chooseOption() {
        String optionsText = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";

        System.out.println(optionsText + " ");
    }
}
