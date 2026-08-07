public class Ques10 {
    static void printLetters(int j, int i) {
    if (j > i) return;
    System.out.print((char)('A' + j - 1));    // convert position -> letter
    printLetters(j + 1, i);
}

static void countRows(int i, int n) {
    if (i > n) return;
    printLetters(1, i);          // same structure as your number triangle, just letters
    System.out.println();
    countRows(i + 1, n);
}

public static void main(String[] args) {
    
    countRows(1, 5);
}
}
