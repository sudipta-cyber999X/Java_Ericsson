package Strings;

import java.util.Scanner;

public class revStr {
    public static String revString (String str) {
        //Convert the string to character array
        char[] arr = str.toCharArray();
        int length = str.length();
        char temp;

        for (int i = 0; i < length/2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        return new String(arr); //Convert array back to String
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String reversed = revString(str);

        System.out.println("Reversed: " + reversed);
    }
}
