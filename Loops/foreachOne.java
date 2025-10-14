package Loops;

import java.util.Scanner;

public class foreachOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        //input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output of the Array: ");
        //Output using Enhanced-for loop:
        for(int num: arr) {
            System.out.print(num+";");
        }
    }
}
