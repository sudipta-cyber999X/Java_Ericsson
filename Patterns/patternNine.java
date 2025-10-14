package Patterns;

public class patternNine {
    //0-1 Triangle
    public static void main(String[] args) {
        int rows = 5;

        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                //cells -> (i,j) => (1,1) -> 1; (2,1) -> 0, (2,2) -> 1; (3,1) -> 1, (3,2) -> 0, (3,3) -> 1
                // if (i % 2 == 1 && j % 2 == 1) {
                //     System.out.print("1 ");
                // } else {
                //     System.out.print("0 ");
                // }
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
