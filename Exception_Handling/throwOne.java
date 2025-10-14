package Exception_Handling;

public class throwOne {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        }
        System.out.println("You can vote");
    }
}
