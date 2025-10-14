package Advanced_Pattern;

public class patternTwelve {
    //Number Pyramid
    public static void main(String[] args) {
        int rows = 5;
        // int count = 1;

        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            //Numbers
            for (int j = 1; j <= i; j++) {
                // System.out.print(count+" ");
                System.out.print(i+" ");
            }
            // count++;
            System.out.println();
        }
    }
}
