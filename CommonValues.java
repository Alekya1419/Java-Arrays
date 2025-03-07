package Arrays;
import java.util.HashSet;

public class CommonValues {
    public static void findCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println("Common value: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {30, 40, 50, 60};
        findCommon(arr1, arr2);
    }
}
