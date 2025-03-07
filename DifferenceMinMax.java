package Arrays;
public class DifferenceMinMax {
    public static int difference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Difference: " + difference(numbers));
    }
}

