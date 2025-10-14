package Patterns;

public class patternSix {
    //Half Pyramid with Numbers
    public static void main(String[] args) {
        int rows = 5;
        
        //Outer Loop
        for (int i = 1; i <= rows; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
