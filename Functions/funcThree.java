package Functions;

import java.util.Scanner;

public class funcThree {
    public static int printMul(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = printMul(a, b);
        System.out.println("Product is: "+mul);
    }
}
