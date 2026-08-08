

public class Ques3 {

    static int countVowelsHelper(char[] arr, int i, int count) {
    if (i == arr.length) return count;                 // base case
    if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
        count += 1;
    }
    return countVowelsHelper(arr, i + 1, count);         // return, to relay value up
}

    static int countVowels(String s) {
        char[] arr = s.toCharArray();
        return countVowelsHelper(arr, 0, 0);
}
    public static void main(String[] args) {
        System.out.println(countVowels("hello"));
    }
}
