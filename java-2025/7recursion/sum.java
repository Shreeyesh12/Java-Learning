import java.util.*;

public class sum {

    public static int sumOfNat(int n){
        if(n == 5){
            return 0;
        } 
        return n+sumOfNat(n+1);
        
    }

    /*public static void sumOfNat(int i, int n, int sum){
        if(n == i){
            sum=sum+i;
            System.out.println((sum));
            return ;
        } 
        sum = sum+i;
        sumOfNat(i+1, n, sum);       
    }*/
    public static void main(String[] args) {
        System.out.println(sumOfNat(2));
        
    }
    
}
