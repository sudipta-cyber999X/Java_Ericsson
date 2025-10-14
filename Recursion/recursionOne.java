package Recursion;

public class recursionOne {
    public static void printNumbers (int num) {
        if (num == 0) {
            return;
        } //BASE CASE

        System.out.println(num); //Print
        printNumbers (num - 1); //Recursion
    }

    public static void incNumbers (int num) {
        if (num == 6) {
            return;
        }

        System.out.println(num);
        incNumbers(num + 1);
    }

    public static void main(String[] args) {
        int num = 5;
        printNumbers(num);

        int incNum = 1;
        incNumbers(incNum++);
    }
}
