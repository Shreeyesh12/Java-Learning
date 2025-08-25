import java.util.*;
public class fib {
    public static void main(String arhs[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of fibonaci series : ");
    int n=sc.nextInt();
    int first = 0;
    int second = 1;
    
    System.out.print(+first+ " " +second+ " ") ;
    for(int i=2;i<n;i++){
        int next = first+second;
        System.out.print(+next+ " ");
        first = second;
        second = next;
    }
}
}    
