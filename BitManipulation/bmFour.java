package BitManipulation;

import java.util.Scanner;

public class bmFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a for 0 or 1: ");
        int oper = sc.nextInt();

        int num = 5;
        int pos = 1;

        // swtich(oper) {
        //     case 0: 
        //         int bitMask = 1 <<  pos;

        //         break;

        //     case 1:
        //         int bitMask = 1 << pos;
        //         int newNumber = bitMask | num;
        //         System.out.println(newNumber);
        //         break;
        //     default:
        //         System.out.println("Invalid input");
        //         break;
        // }

        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | num;
            System.out.println(newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & num;
            System.out.println(newNumber);
        }
    }
}
