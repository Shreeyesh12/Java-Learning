package demo;
import example.abc;
import example.ex01;
import example.ex02;


public class main {
    public static void main(String[] args) {
        System.out.println("In class main");

        abc obj1 = new abc();
        int result1 = obj1.add(5, 7);
        System.out.println("Result from abc: " + result1);
    }
    
    
}
