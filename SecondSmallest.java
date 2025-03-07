package Arrays;
import java.util.Arrays;

public class SecondSmallest {
    public static int secondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1]; // Second smallest element
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 15};
        System.out.println("Second smallest number: " + secondSmallest(numbers));
    }
}

