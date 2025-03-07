package Arrays;
public class AverageArray {
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Average: " + average(numbers));
    }
}

