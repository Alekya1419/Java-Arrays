package Arrays;
public class FindMissingNumber {
    public static int findMissing(int[] arr) {
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[99];
        for (int i = 1, j = 0; i <= 100; i++) {
            if (i != 55) numbers[j++] = i; // Missing number is 55
        }
        System.out.println("Missing number: " + findMissing(numbers));
    }
}

