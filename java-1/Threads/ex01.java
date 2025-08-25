package Threads;

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("In class A :  " +i );
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("In class B :  " +i );
            
        }
    }

}


public class ex01 {
    public static void main(String[] args){
        A obj = new A();
        obj.start();
        B obj2=new B();
        obj2.start();

    }
    
}
