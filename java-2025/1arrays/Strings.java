package arrays;

import java.util.Scanner;

public  class Strings{


    /**
     * @param args
     */
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName = "Shree";
        System.out.println("Enter last name : ");
        String lastName = sc.next();

        //concatination
        String fullName = firstName+" "+lastName;
        System.out.println("Full Name : " +fullName);

        //charAt()
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i) +" ");
        }
        System.out.println(" ");

        //compareTo()
        //syntax argu1.compareTo(arg2);
        //returs S1==S2 =>0
        //S1>S2 => +ve num
        //S1<S2 => -ve num


        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal ");   
        }else {
            System.out.println("Strings are not equal ");
        }


        //substring(start index, last index) : last index is not mandetory


        String Stru = "Shreeyesh";
        System.out.println(Stru.substring(4, Stru.length()));


        

    }
    
}
