package Recursion;

import java.util.Scanner;

public class recursionFour {
    public static int calcFibo (int num) {
        if (num <= 1) {
            return num;
        }
        int fiboN = calcFibo(num-1) + calcFibo(num-2);
        return fiboN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        int result = calcFibo(num);
        System.out.println(result);
    }
}
