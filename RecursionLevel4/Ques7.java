public class Ques7 {

    static void printChars(char[] arr, int i) {
    if (i == arr.length) return;              // base case: no characters left
    System.out.print(arr[i]);                    // print current character
    printChars(arr, i + 1);                       // move to next
}

static void printChars(String s) {
    printChars(s.toCharArray(), 0);              // wrapper: converts and starts recursion
}


    public static void main(String[] args) {
        printChars("hello");
    }
}
