import java.net.SocketPermission;
import java.util.Scanner;

public class arrayExample {

    public static int largestNum(int[] a) {
        int large = a[0];
        for (int i = 1; i < a.length; i++) {
            if (large < a[i]) {
                large = a[i];
            }
        }
        return large;

    }

    public static int sumOfArray(int[] b){
        int sum = b[0];
        for(int i=1;i<b.length;i++){
            sum = sum+b[i];

        }
        return sum;
    }

    public  int linearSearch(int[] a, int num){
        for(int i=0;i<a.length;i++){
            if(num == a[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter the numbers in array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The numbers in array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        int x = largestNum(numbers);
        System.out.println("The largest number in array is : " + x);

        int y = sumOfArray(numbers);
        System.out.println("the sum of array is : " +y);

        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        int z = linearSearch(numbers, num);
        if(z==-1){
            System.out.println("The number not found in array ");
        }else{
            System.out.println("the number found in a position: " +z);


        }
        //2-D array
        System.out.println("Enter the Size of array : ");
        System.out.print("row : ");
        int row=sc.nextInt();
        System.out.print("col : ");
        int col=sc.nextInt();
        int arr2[][]=new int[row][col];
        System.out.print("Enter the elements in array:");
        for(int i =0;i<row;i++){
            System.out.println("for " +i +"th row");
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("The elements in array are : ");
        for(int i =0;i<row;i++){
            System.out.println("for " +i +"th row");
            for(int j=0;j<col;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

        

    }

}
