import java.util.Arrays;

public class descending {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 3, 6};

        // Sort the array in descending order
        Arrays.sort(numbers, (a, b) -> b - a);

        // Print the sorted array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
