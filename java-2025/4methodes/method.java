class Calculator {
    private int a = 10;
    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
}

class Example {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.getA());
    }
}

public class Method {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.getA());
    }
}
