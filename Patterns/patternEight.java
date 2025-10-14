package Patterns;

public class patternEight {
    //Floyd's Triangle
    public static void main(String[] args) {
        int rows = 5;

        int count = 1;
        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
