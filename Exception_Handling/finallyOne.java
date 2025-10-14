package Exception_Handling;

public class finallyOne {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Hello World!");

        try {
            System.out.println(arr[8]);
        } catch (Exception e) {
            System.out.println("Exception Handled!");
        } finally {
            System.out.println("I will execute always!");
        }

        System.out.println("Bye World!");
    }
}
