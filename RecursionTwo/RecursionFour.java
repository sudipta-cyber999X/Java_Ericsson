/*
 * Check if an array is Strictly increasing... 
 * Return the output in true/ false boolean format!
 */

package RecursionTwo;

public class RecursionFour {
    public static boolean isSorted(int[] arr, int idx) {
        //Base Condition: 
        if (idx == arr.length-1) {
            return true;
        }

        // //Check: Approach One
        // if (arr[idx] < arr[idx+1]) {
        //     return isSorted(arr, idx+1);
        // } else {
        //     return false;
        // }

        //Check: Approach Two
        if (arr[idx] >= arr[idx+1]) {
            return false;
        } else {
            return isSorted(arr, idx+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 7};
        boolean isResult = isSorted(arr, 0);
        System.out.println(isResult);
    }
}