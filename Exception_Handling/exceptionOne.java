package Exception_Handling;

public class exceptionOne {
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        System.out.println("Hello Guys!");
        // System.out.println(arr[8]);

        try {
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried Array Index Out of Bound Exceptions!");
        }

        System.out.println("Bye Guys!");
    }
}
