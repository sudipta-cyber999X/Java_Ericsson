package Recursion;

import java.util.Scanner;

public class recursionTwo {
    //Sum of n natural numbers using recursion
    public static void natNum (int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        natNum(i+1, num, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int num = sc.nextInt();

        natNum(1, num, 0);
    }
}
