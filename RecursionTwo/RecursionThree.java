/*
 * The first and last Occurance of element in a String!
 */
package RecursionTwo;

public class RecursionThree {
    static int first = -1;
    static int last = -1;

    public static void countOccurance(String str, int idx, char element){
        //BASE CONDN. -> (idx == str.length())
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        //Store the string as char and compare with the element
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        //Recursive call: 
        countOccurance(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str = "aabcdegah";
        countOccurance(str, 0, 'a');
    }
}
