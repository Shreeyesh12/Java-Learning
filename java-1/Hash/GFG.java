package Hash;

// Java program to create HashMap from an array
// by taking the elements as Keys and
// the frequencies as the Values

import java.util.HashMap;

class GFG {

    // Function to create HashMap from array
    static void createHashMap(int arr[])
    {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            Integer c = hmp.get(arr[i]);

            if(hmp.get(arr[i]) == null){
                hmp.put(arr[i], 1);
            }
            else{
                hmp.put(arr[i], ++c);
            }

        }
        System.out.println(hmp);
    }

    // Driver method to test above method
    public static void main(String[] args)
    {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        createHashMap(arr);
    }
}