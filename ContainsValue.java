package Arrays;
public class ContainsValue {
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        System.out.println("Contains 10? " + contains(arr, 10));
    }
}
