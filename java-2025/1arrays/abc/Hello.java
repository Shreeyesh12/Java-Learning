package abc;

import java.util.Scanner;



public class Hello {

    public static int averageOfThreeNum(int x, int y, int z){
        return ((x+y+z)/3);
    
    }
public static void fibNUm(int n){
    int n1=0,n2=1,n3;
    System.out.println("The fib series is : \n");
    System.out.println(+n1);
    System.out.println(+n2);
    for(int i=2;i<n;i++){
        n3=n1+n2;
        System.out.println(+n3);
        n1=n2;
        n2=n3;

    }


}


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d = averageOfThreeNum(a,b,c);
        System.out.println("The average of three numbers is: " +d);

        System.out.println("Enter the number for fib series :");
        int n=sc.nextInt();
        fibNUm(n);




    }
  






    
}
