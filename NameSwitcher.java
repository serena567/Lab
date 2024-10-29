package neu.edu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class NameSwitcher {

    public static void main(String[] args) {
        // Initialize an ArrayList with five names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amy", "joel", "Charlie", "serena", "Eve"));

        // Create a new ArrayList to store names with switched letters
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(swapFirstAndLastLetters(name));
        }

        // Print the original and switched names
        System.out.println("Names = " + listToString(names));
        System.out.println("Names (switched) = " + listToString(switchedNames));
    }

    // Method to swap the first and last letters of a name
    public static String swapFirstAndLastLetters(String name) {
        if (name.length() <= 1)
            return name; // Handle single-character names

        // Swap the first and last letters
        String swapped = name.substring(name.length() - 1).toUpperCase() +
                name.substring(1, name.length() - 1).toLowerCase() +
                name.substring(0, 1).toLowerCase();

        return swapped;
    }

    // Method to format an ArrayList as a string with comma-separated values
    public static String listToString(ArrayList<String> list) {
        return "{ " + String.join(", ", list) + " }";
    }
}
