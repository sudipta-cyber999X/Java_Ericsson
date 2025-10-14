package Exception_Handling;

public class exceptionThree {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        // try {
        //     int divide = 5/0;
        //     System.out.println(arr[8]);
        // } catch (ArithmeticException e) {
        //     System.out.println("Handling the Exception!");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Handling the Exceptions!");
        // }

        try {
            int divide = 5/0;
            System.out.println(arr[8]);
        } 
        // catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
        //     System.out.println("Handling the Exceptions!");
        // } catch (RuntimeException e) {
            
        // }
        //For all kinds of Exceptions:
        catch (Exception e) {
            System.out.println("All Exceptions handled!");
        }
    }
}
