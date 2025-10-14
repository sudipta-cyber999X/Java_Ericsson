package Recursion;

import java.util.Scanner;

public class recursionThree {
    public static int factNum (int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factNm1 = factNum(n-1);
        int factN = n * factNm1;
        return factN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        int ans = factNum(num);
        System.out.println(ans);
    }
}
 