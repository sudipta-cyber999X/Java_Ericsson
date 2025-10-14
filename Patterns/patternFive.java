package Patterns;

public class patternFive {
    //Inverted Half Pyramid (Rotated by 180-degrees)
    public static void main(String[] args) {
        int rows = 4;

        //outer loop
        for (int i = 1; i <= rows; i++) {
            //inner loop -> space print
            // for (int k = rows; k >= i; k--) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            //inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
