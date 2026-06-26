
import java.util.Scanner;

// ques:take password string and check basic rules(length>=8 and contains atleast one digit)
public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();

        boolean isValid=false;
// this will check that digit is there or not and isDigit value is to check whether the value has digit or not
        for(int i=0;i<password.length();i++){
            Character ch= password.charAt(i);
            if(Character.isDigit(ch)){
                isValid=true;
                break;
            }
        }
        if(password.length()>8 && isValid){
            System.out.println("Password is correct login in");
        }else{
            System.out.println("password is not valid");
        }
    }
}
