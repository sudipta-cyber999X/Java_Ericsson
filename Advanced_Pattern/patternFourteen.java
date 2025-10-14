package Advanced_Pattern;

public class patternFourteen {
    //Diamond Pattern
    public static void main(String[] args) {
        int rows = 4;

        //Upper Half
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            //left side
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            //Right Side
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower half
        for (int i = rows; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            //1st star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
