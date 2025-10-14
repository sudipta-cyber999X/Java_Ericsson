package Projects;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Calculator Application:");
        System.out.print("Select Operation: +, -, *, /: ");
        String operation = sc.nextLine();
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        switch (operation) {
            case "+":
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case "-": 
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case "*":
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operation!");
                break;
        }
    }
}
