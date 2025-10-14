package Patterns;

public class patternSeven {
    //Inverted Half Pyramid with Numbers
    public static void main(String[] args) {
        int rows = 5;

        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //Inner Loop
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //ALTER
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
