package Conditional;

import java.util.Scanner;

public class conditionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println(a + " is Equal to " + b);
        // } else {
        //     if (a > b) {
        //         System.out.println(a + " is Greater than " + b);
        //     } else {
        //         System.out.println(a + " is Less than " + b);
        //     }
        // }

        if (a == b) {
            System.out.println(a + " is Equal to " + b);
        } else if (a > b) {
            System.out.println(a + " is Greater than " + b);
        } else {
            System.out.println(a + " is Less than " + b);
        }
    }
}
