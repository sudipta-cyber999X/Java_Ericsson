package Advanced_Pattern;

public class patternEleven {
    //Solid Rhombus
    public static void main(String[] args) {
        int rows = 5;

        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //Spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            //Stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
