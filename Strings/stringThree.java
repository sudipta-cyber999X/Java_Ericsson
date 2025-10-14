package Strings;

public class stringThree {
    public static void main(String[] args) {
        //Compare Two Strings
        String name1 = "Tony";
        String name2 = "Tony";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        //Substring
        String sentence = "I am IronMan!";

        String finalName = sentence.substring(5, sentence.length());
        System.out.println(finalName);
    }
}