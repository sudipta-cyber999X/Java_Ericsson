package Patterns;

public class patternFour {
    // Inverted Half Pyramid
    public static void main(String[] args) {
        int rows = 4;

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
