package Exception_Handling;

public class exceptionTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Hello Guys!");

        //Multiple try-catch blocks
        try {
            int var = 5/0; //Arithmetic Exception e 

            System.out.println(arr[8]);

        } catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried ArrayIndexOutOfBoundsException!");
        }

        System.out.println("Bye Guys!");
    }
}
