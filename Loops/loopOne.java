package Loops;

import java.util.*;

public class loopOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the arbitary Number: ");
        int num = sc.nextInt();

        int sum = 0;
        //Sum of N Natural Numbers:
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
