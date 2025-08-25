package Threads;



class BB implements Runnable{
    public void run(){
        System.out.println("Hello : " + Thread.currentThread().getName());
    }

}

public class Threads2 {
    public static void main(String[] args) throws InterruptedException{


        Runnable obj1= () ->{
            System.out.println(" Hi : " + Thread.currentThread().getName());
        };

        Runnable obj2=new BB();

        Thread t1 = new Thread(obj1, "Thread-1");
        Thread t2 = new Thread(obj2, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    
}
