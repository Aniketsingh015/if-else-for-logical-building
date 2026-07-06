// print stars in odd number
/*
 *
 ***
 *****
 *******
*********
*/
public class Ques7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1; j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
