// Ques: Print all odd numbers between 1 and 100

public class Ques3 {
    public static void main(String[] args) {
        //approach 1: we can go for checking the numbers and then printing the odd numbers
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);  

    }
}

// approach 2: directly check the odd number
for(int i=1;i<=100;i+=2){
    System.out.println(i);      
    }
}
}