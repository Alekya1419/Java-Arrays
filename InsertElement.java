package Arrays;
import java.util.Arrays;

public class InsertElement {
    public static int[] insert(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index)
                newArr[i] = value;
            else
                newArr[i] = arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println("Updated Array: " + Arrays.toString(insert(arr, 2, 3)));
    }
}

