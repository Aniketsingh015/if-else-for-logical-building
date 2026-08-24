// Reverse only characters, keeping digits in place.

public class Ques9 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            boolean leftIsLetter = Character.isLetter(arr[left]);
            boolean rightIsLetter = Character.isLetter(arr[right]);

            if (leftIsLetter && rightIsLetter) {
                // Case 1: both letters -> swap, move both inward
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            } else if (leftIsLetter && !rightIsLetter) {
                // Case 2: left is letter, right is digit -> right can't be touched, move right inward
                right--;

            } else if (!leftIsLetter && rightIsLetter) {
                // Case 3: left is digit, right is letter -> left can't be touched, move left inward
                left++;

            } else {
                // Case 4: both digits -> both stay in place, move both inward
                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }
}