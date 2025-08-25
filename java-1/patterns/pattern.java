package patterns;

import java.util.Scanner;

class abc {
    public void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n) - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i >= n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    int stars = 1;

    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                stars = 1;
            else
                stars = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(stars);
                stars = 1 - stars;
            }
            System.out.println("");

        }
    }

    int nu = 1;

    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nu + " ");
                nu = nu + 1;
            }
            System.out.println("");
        }
    }

    public void pattern7(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println("");
        }

    }

    public void pattern8(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }

            System.out.println("");
            space = space - 2;
        }

    }

    public void pattern9(int n) {

        for (int i = 0; i < n; i++) {
            char s = 'A';
            for (int j = 0; j < +n - i; j++) {
                System.out.print(s + " ");
                s++;
            }
            System.out.println("");
        }

    }

    public void pattern10(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

            }
            ch++;
            System.out.println("");
        }

    }

    public void pattern11(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            char ch = 'A';
            int breakPoint = (2 * i) / 2;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
                if (k < breakPoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

    public void pattern12(int n) {

        for (int i = 1; i <= n; i++) {

            // char ch = (char) ('F' - i);
            for (char ch = (char) ('E' - i + 1); ch <= 'E'; ch++) {
                System.out.print(ch);
            }

            System.out.println("");
        }

    }

    public void pattern13(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n)
                star = 2 * n - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("A");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            if (i < n)
                spaces = spaces - 2;
            else
                spaces = spaces + 2;

            System.out.println("");

        }

    }
}

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        abc obj = new abc();

        obj.pattern13(n);

    }
}