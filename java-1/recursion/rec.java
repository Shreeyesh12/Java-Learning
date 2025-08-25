package recursion;

 class recursion1{

    public int fib(int n){

        int a = 0;
        int b = 1;
        
        System.out.print(a);
        if(n>0) System.out.print(""+b);
        int next = a+b;
        while(next<=n){
                System.out.print(" "+next);
            
            a =b;
            b=next;
            next=a+b;
        }
        return 1;

    }
}

public class rec {
    public static void main(String[] args) {
        recursion1 re = new recursion1();
    re.fib(15);
    }
    
    
}
