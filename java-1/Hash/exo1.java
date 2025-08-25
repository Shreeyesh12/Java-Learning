package Hash;

import java.util.*;

public class exo1 {
    public static void main(String args[]){
        int[] arr = {1, 1,3, 5, 7,1,1,3,5,6,7,8};
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        //freq.put(2, 3);
        
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        System.out.println(freq);
        for(int key: freq.keySet()){
            System.out.println(key+ "-> Occurs : " + freq.get(key) +" Times." );
        }

        

        
    //     int mostFreq =0;
    //     for(int value: freq.values()){
    //         if(value>mostFreq) mostFreq = value;

    //     }
    //     System.out.println("The most frequent value is : "+mostFreq);
    //     for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    // if (entry.getValue() == mostFreq) {
    //     System.out.println("Most frequent element: " + entry.getKey());
    // }
//}

        String s = "wabAaa?babqwe";
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            //for at lower case
            //char ch = Character.toLowerCase(s.charAt(i));
            //for case sensitive 
            char ch = s.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
            
        }
        for(char c : hmap.keySet()){
            System.out.println(c +" -> appears : " + hmap.get(c) + " times, In a String : " + s);
        }
        
       
        

    }
    
}
