// check if string is palindrome or not
public class Ques2 {
    public static void reverseHelper(char [] arr,int left,int right){
        if(left>=right)return;
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseHelper(arr, left+1, right-1);

    }
    public static String isPalindrome(String s){
        char[] arr=s.toCharArray();
        reverseHelper(arr, 0, arr.length-1);
        return new String(arr);
    }

    public static boolean checkPalindrome(String s){
        String palindrome=isPalindrome(s);
        if(palindrome.equals(s))
            {
                return true;
    }else{
        return false;
    }
}

    public static void main(String[] args) {
        System.out.println(checkPalindrome("olo"));
    }
}
