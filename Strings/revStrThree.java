package Strings;

import java.util.Scanner;

public class revStrThree {
    public static String revStringBuilder(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        //Convert the StringBuilder to String and return it
        return reversed.toString(); 
        
    }

    public static String revString(String str) {
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String reversed = revStringBuilder(str);
        System.out.println(reversed);
    }
}
