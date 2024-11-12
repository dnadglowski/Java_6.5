import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of inputs
        System.out.println("Enter the number of values you want to sort:");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        Integer[] numbers = new Integer[n];

        // Read numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted numbers in order: " + Arrays.toString(numbers));
    }
}
