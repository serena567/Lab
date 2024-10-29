package neu.edu.mgen;

public class ArrayMaxValues {

    public static void main(String[] args) {
        // Initialize arrays x and y with 5 elements each
        int[] x = { 4, 9, 19, 8, 7 };
        int[] y = { 9, 7, 11, 6, 8 };

        // Create array z to store the maximum of each pair from x and y
        int[] z = new int[5];
        for (int i = 0; i < z.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays in the specified format
        System.out.println("Array x = " + arrayToString(x));
        System.out.println("Array y = " + arrayToString(y));
        System.out.println("Array z = x + y = " + arrayToString(z));
    }

    // Method to format an array as a string with comma-separated values
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("{ ");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append(" }");
        return result.toString();
    }
}
