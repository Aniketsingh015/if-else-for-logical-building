
// a-z->97-122
// A->Z ->65-90
public class Ques7 {
    public static void main(String[] args) {
        String s="Apple";
        int beforeCount=0;
        int afterCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)< 'm'){
                beforeCount++;
            }else{
                afterCount++;
            }
        }
        System.out.println(beforeCount);
        System.out.println(afterCount);
    }
}
