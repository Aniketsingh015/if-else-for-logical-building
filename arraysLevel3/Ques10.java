import java.util.Arrays;

public class Ques10 {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 6, 7};
        int arr2[] = new int[arr1.length];  // same length, derived not hardcoded

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];  // one shared index — same order, same size
        }

        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Copy:     " + Arrays.toString(arr2));
    }
}