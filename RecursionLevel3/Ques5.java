// Print pattern of numbers recursively (1 to n each row).

public class Ques5 {
    static void printStars(int n) {
    if (n == 0) return;
    
    printStars(n - 1);
    System.out.print(n);
}
static void countRows(int i, int n) {
    if (i > n) return;
    printStars(n);              // draw one full row
    System.out.println();        // move to next line
    countRows(i + 1, n);         // move to next row
}
public static void main(String[] args) {
    countRows(1, 5);
}
}
