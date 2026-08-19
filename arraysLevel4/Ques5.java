public class Ques5 {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8};
        int arr2[] = {4, 8, 10, 12};

        // Block 1: elements in arr1 but not in arr2
        System.out.println("In arr1 but not arr2:");
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr1[i]);
            }
        }

        // Block 2: elements in arr2 but not in arr1
        System.out.println("In arr2 but not arr1:");
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr2[i]);
            }
        }
    }
}