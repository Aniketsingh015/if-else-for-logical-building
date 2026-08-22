

public class Ques4 {
    public static void main(String[] args) {
        
        String str="Hello world";
        for(int i=0;i<str.length();i++){
            boolean seenbefore=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                seenbefore=true;
                break;
            }
            }

            if(!seenbefore){
                int count=0;
                for(int k=0;k<str.length();k++){
                    if(str.charAt(i)==str.charAt(k)){
                        count++;
                    }
                }

                System.out.println(str.charAt(i)+ "count is" + '=' + count) ;
            }

        }
    }
}
