package Advanced_Pattern;

public class patternThirteen {
    //Palindromic Pattern
    public static void main(String[] args) {
        int rows = 5;

        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //spaces -> (rows-i)
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            //Left half
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            //Right half 
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
