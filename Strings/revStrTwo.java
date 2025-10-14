package Strings;

import java.util.Scanner;

public class revStrTwo {
    public static void revString() {
        StringBuilder sb = new StringBuilder("I'm Iron Man!");

        for (int i = 0; i < sb.length()/2; i++) {
            char frontChar = sb.charAt(i);
            char lastChar = sb.charAt(sb.length()-i-1);

            //StringBuilder Function -> set char at index
            sb.setCharAt(i, lastChar);
            sb.setCharAt(sb.length()-i-1, frontChar);
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();
        
        //Using String Builder!
        // StringBuilder sb = new StringBuilder("Hello World");

        //-> Input in StringBuilder
        StringBuilder sb = new StringBuilder(input);

        System.out.println(sb.reverse());

        revString();
    }
}
