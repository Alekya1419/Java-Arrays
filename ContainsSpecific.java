package Arrays;
public class ContainsSpecific {
    public static boolean containsBoth(int[] arr, int num1, int num2) {
        boolean foundNum1 = false, foundNum2 = false;
        for (int num : arr) {
            if (num == num1) foundNum1 = true;
            if (num == num2) foundNum2 = true;
        }
        return foundNum1 && foundNum2;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 12, 23, 30};
        System.out.println("Contains 12 and 23: " + containsBoth(numbers, 12, 23));
    }
}
