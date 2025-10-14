package Backtracking;

public class backtrackingOne {
    public static void printPermutation (String str, String perm, int idx) {
        //Base case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        //Loops through all characters of the string:
        for (int i = 0; i < str.length(); i++) {
            //Select char at index
            char currChar = str.charAt(i);
            //Remove the picked from String
            String newStr = str.substring(0, i) + str.substring(i+1, str.length());

            //Recursive call with updated String and remaining Characters:
            printPermutation(newStr, perm+currChar, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        //Function Call: 
        printPermutation(str, "", 0);
    }
}
