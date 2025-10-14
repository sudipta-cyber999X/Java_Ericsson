package Conditional;

import java.util.*;

public class switchOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number among 1, 2 & 3: ");
        int impression = sc.nextInt();

        switch (impression) {
            case 1:
                System.out.println("Hello!");
                break;
            
            case 2: 
                System.out.println("Namaste!");
                break;

            case 3:
                System.out.println("Bonjour!");
                break;
        
            default:
                System.out.println("Wrong Expression!");
                break;
        }
    }
}
