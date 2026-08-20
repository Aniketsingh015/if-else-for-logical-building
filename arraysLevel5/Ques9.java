public class Ques9 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 2, 4, 3};

        for (int i = 0; i < arr.length; i++) {

            // Step 1: check if arr[i] already appeared earlier (before index i)
            boolean seenBefore = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    seenBefore = true;
                    break;
                }
            }

            // Step 2: if already handled earlier, skip this iteration entirely
            if (seenBefore) {
                continue;
            }

            // Step 3: not seen before -> count its frequency across the whole array
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Step 4: print this distinct value with its frequency
            System.out.println(arr[i] + "=" + count);
        }
    }
}