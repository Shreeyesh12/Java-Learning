package example;

class bcd {
    public int sub(int a, int b) {
        return a - b;
    }
}

public class ex02 {
    public static void main(String[] args) {
        bcd obj = new bcd();
        int result = obj.sub(15, 7); 
        System.out.println("Static Sum = " + result);
    }
}

