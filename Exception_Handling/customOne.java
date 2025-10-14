package Exception_Handling;

import java.util.Scanner;

public class customOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            if (age > 100) {
                throw new MyException("Custom Exception Generated!");
                // throw new ArithmeticException("Morethan 100 not allowed!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    //Pass String message to call the constructor of Parent Class!
    public MyException(String message) {
        super(message);
    }
}