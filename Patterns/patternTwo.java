package Patterns;

public class patternTwo {
    // Hollow Rectangle
    public static void main(String[] args) {
        int row = 4;
        int col = 5;

        //Outer Loop
        for (int i = 1; i <= row; i++) {
            //Inner Loop
            for (int j = 1; j <= col; j++) {
                //Cell -> (i, j)
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
