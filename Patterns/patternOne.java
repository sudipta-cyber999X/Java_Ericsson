package Patterns;

import java.util.*;

public class patternOne {
    //Print pattern: SOLID RECTANGLE
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of N: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        /*NB: The Outer-For Loop determines: total no. of ROWS
         * The inner for loop determines: total no. of COLUMNS
         */
    }
}
