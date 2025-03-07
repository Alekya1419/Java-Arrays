package Arrays;
import java.util.Arrays;

public class RemoveElement {
    public static int[] remove(int[] arr, int value) {
        return Arrays.stream(arr).filter(num -> num != value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("New Array: " + Arrays.toString(remove(arr, 3)));
    }
}
