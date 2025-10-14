/*
 * Print x^n (Stack Height = logn) 
 * Useful as it uses less Memory Space. It's an optimised approach.
 * x^n -> x^(n/2) * x^(n/2); for n = even integer
 * x^n -> x^(n/2) * x^(n/2) * x; for n = odd integer
 */
package Recursion;

public class recursionSix {
    public static int calcPow (int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        //for even
        if (n % 2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        } else {
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int result = calcPow(2, 5);
        System.out.println(result);
    }
}
