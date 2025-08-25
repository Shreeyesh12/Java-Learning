import java.util.*;

public class insertion {
    public static void main(String[] args) {
        int a[] = { 7, 8, 3, 2, 1 };
        for (int i = 1; i < a.length ; i++) {
            int currrent = a[i];
            int j = i - 1;
            while (j >= 0 && currrent < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = currrent;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(+a[k] + " ");
        }

    }
}
