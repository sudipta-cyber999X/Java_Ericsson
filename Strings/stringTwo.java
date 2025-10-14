package Strings;

public class stringTwo {
    public static void main(String[] args) {
        //Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + "@" + lastName;
        //Here the "@" gets deleted after the operation is over. As we haven't stored the character in a variable

        System.out.println(fullName);

        //length() method
        System.out.println(fullName.length());

        //charAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
