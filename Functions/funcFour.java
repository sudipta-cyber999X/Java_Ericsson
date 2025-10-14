package Functions;

import java.util.Scanner;

public class funcFour {
    public static int myFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int fact = myFact(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
