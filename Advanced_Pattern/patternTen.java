package Advanced_Pattern;

public class patternTen {
    //Butterfly Pattern
    public static void main(String[] args) {
        int rows = 4;

        //Upper-Half
        for (int i = 1; i <= rows; i++) {
            //1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces -> 2*(rows-i)
            for (int j = 1; j <= 2*(rows-i); j++) {
                System.out.print("  ");
            }
            //2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Half
        for (int i = rows; i >= 1; i--) {
            //3rd part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= 2*(rows-i); j++) {
                System.out.print("  ");
            }
            //4th part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // // Outer Loop UpperRight
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
