package BitManipulation;
// GET BIT OPERATION

public class bmOne {
    public static void main(String[] args) {
        int num = 5;
        int pos = 3;
        int bitMask = num << pos;

        if ((bitMask & num) == 0) {
            System.out.println("Bit was 0!");
        } else {
            System.out.println("Bit was one.");
        }
    }
}