package Arrays;
import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int num : arr) {
            if (!seen.add(num))
                System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        findDuplicates(arr);
    }
}
