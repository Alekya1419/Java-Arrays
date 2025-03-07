package Arrays;
import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Second largest number: " + secondLargest(numbers));
    }
}

