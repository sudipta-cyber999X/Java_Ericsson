package Loops;

import java.util.*;

public class loopTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want Table of: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
