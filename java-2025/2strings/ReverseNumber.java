import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            System.out.println(reversed);
            n /= 10; // Remove last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Reversed number: " + reverse(num));
    }
}
