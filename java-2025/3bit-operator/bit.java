import java.util.*;

public class bit {
    public static void main(String args[]){
        System.out.println("Hello");

        //left shift 1<<num => 

        //get
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if((n & bitMask)==0){
            System.out.println("the number is zero");
        }else{
            System.out.println("The  number is one");
        }

        //set bit
        int n1 =5;
        int pos1=1;
        int bitMask1=1<<pos1;

        int newNumber=n1 | bitMask1;
        System.out.println("The set bit is : " +newNumber);

        // clar bit
        int n2=5;
        int pos2 = 2;
        int bitMask2= 1 << pos2;
        int notBitMask2= ~(bitMask2);

        int newNumber2=n2 & notBitMask2;
        System.out.println("The clear bit is : " +newNumber2);


    }
}
