//Print x^n (Stack Height = n)
// x^n = x * x * x *... * n-times!
//1. Var: x, n
//2. => x^n = x * x^(n-1)
//3. x^0 = 1; x = 0 => 0 ]-> 2 BASE CASES!

package Recursion;

public class recursionFive {
    public static int calcPow (int x, int n) {
        if (x == 0) { //Base Case 1
            return 0;
        }
        if (n == 0) { //Base Case 2
            return 1;
        }

        int calcPowN = x * calcPow(x, n-1);
        return calcPowN;
    }
    public static void main(String[] args) {
        int result = calcPow(2, 5);
        System.out.println(result);
    }
}
