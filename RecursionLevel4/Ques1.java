// Reverse a string using recursion
public class Ques1 {
    public static void reverseHelper(char [] arr,int left,int right){
        if(left>=right)return;
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseHelper(arr, left+1, right-1);

    }

    public static String reverseString(String s){
        char [] arr=s.toCharArray();
        reverseHelper(arr,0,arr.length-1);
        return new String (arr); 
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }
}
