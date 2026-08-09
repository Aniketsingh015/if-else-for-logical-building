public class Ques8 {

    static void printReverse(String s) {
    if (s.length() == 0) return;                     // base case
    printReverse(s.substring(1));                       // recurse FIRST
    System.out.print(s.charAt(0));                       // print AFTER -- on the way back up
}

    public static void main(String[] args) {
        printReverse("anjali");
    }
}
