package Strings;

public class strBuilderOne {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        // System.out.println(sb.setCharAt(0, 'b')); //Can't be used as it's not the format for declaration

        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert Function
        sb.insert(2, 'S');
        System.out.println(sb);

        //Delete a part
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append('d');
        System.out.println(sb);
    }
}
