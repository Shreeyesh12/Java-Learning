import java.util.*;

public class bubble {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2,1 };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //ascending order
                if (arr[j] > arr[j + 1]) {
                    //for descending order change <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(+arr[k] + " ");
        }
    }

}
