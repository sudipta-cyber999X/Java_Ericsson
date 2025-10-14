package Array;

import java.util.Scanner;

public class arrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();

        int[] marks = new int[size];

        //Input marks:
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        //Print marks:
        for (int i = 0; i < size; i++) {
            System.out.println("Marks of "+i+" is "+marks[i]);
        }
    }
}
