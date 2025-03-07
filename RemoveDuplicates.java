package Arrays;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10};
        System.out.println("Array without duplicates: " + Arrays.toString(removeDuplicates(numbers)));
    }
}

