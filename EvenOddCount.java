package Arrays;
public class EvenOddCount {
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};
        countEvenOdd(numbers);
    }
}

