package digits;

import java.util.*;

class digit {

    public int[] divisors(int n) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ls.add(i);
                if (n / i != i)
                    ls.add(n / i);
            }
        }
        Collections.sort(ls);
        int[] arr = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            arr[i] = ls.get(i);
        }
        return arr;

    }
}

public class dig {
    public static void main(String args[]) {
        digit obj = new digit();
        int[] l = obj.divisors(36);
        for (int k : l) {
            System.out.print(k + ",");
        }

    }

}
