package Arrays;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}
