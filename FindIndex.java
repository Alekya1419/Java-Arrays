package Arrays;
public class FindIndex {
    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int value = 30;
        System.out.println("Index of " + value + ": " + getIndex(arr, value));
    }
}
