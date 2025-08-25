public class revString {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;//5-1-0 which points at o

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            // char temp;
            // temp = frontChar;
            // frontChar =backChar;
            // backChar = temp;
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

        
        String str = "SHreeYESH";
        StringBuilder sb3 = new StringBuilder(str);
        sb3.reverse();
        System.out.println(sb3);
    }
    
}
