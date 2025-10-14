//Print a given name in a Function.

package Functions;

import java.util.Scanner;

public class funcOne {
    public static void printMyName(String name) {
        System.out.println("Name is: "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        System.out.println("Enter your name: ");
        printMyName(name); //Function call
    }
}
