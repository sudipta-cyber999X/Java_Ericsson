package Functions;

import java.util.*;

public class funcTwo {
    /*
    public static void printTheSum (double a, double b) {
        System.out.print("Sum is: "+ (a+b));
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter Second Number:");
        double b = sc.nextDouble();

        printTheSum(a, b);
    }
    */

    public static int calculateSum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum is: "+sum);
    }
}
