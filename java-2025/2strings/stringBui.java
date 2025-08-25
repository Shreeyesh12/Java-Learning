public class stringBui {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charecter at
        System.out.println(sb.charAt(0));

        //set char at index 0 it replaces chat ate position
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //insert charecter at position without replacing
        sb.insert(3, 'n');
        System.out.println(sb);

        //removing charecter :end range is exclusive
        sb.delete(1, 4);
        System.out.println(sb);
        

        StringBuilder sb2 = new StringBuilder("H");
        //append
        sb2.append('e');
        sb2.append('l');
        sb2.append('l');
        sb2.append('o');
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
    
}
