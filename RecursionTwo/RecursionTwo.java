/*
 * Reverse a String using Recursion!
 */

package RecursionTwo;

public class RecursionTwo {
    public static void revString(String str, int idx) {
        //BASE CONDITION
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        revString(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        revString(str, str.length()-1);
    }
}
