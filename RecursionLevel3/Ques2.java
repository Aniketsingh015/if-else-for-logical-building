// Print a square of stars recursively (n×n).

public class Ques2 {
    static void printStars(int n) {
    if (n == 0) return;
    System.out.print("*");
    printStars(n - 1);
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
