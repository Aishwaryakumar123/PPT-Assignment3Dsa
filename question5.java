import java.util.Arrays;

public class question5 {
    public static void main(String[] args) {
        int []digits={1,2,9};
        int n= digits.length;

        for(int i=n-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                break;
            }
            else{
                digits[i]=0;
            }
            if(digits[0]==0){
                int []res= new int[n+1];
                res [0]=1;
                System.out.println(res);
                return ;
            }

        }
        System.out.println(Arrays.toString(digits));
        return;
    }
}
