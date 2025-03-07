package Arrays;
public class MinMaxArray {
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 19, 8};
        findMinMax(arr);
    }
}

