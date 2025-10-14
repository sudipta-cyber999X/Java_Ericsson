package Array;

public class arrayOne {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // int marks[] = new int[3];
        marks[0] = 95; //phy
        marks[1] = 93; //chem
        marks[2] = 89; //eng

        // System.out.println(marks); //[I@28a418fc Jargons get printed!

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //We can do the same task of printing using loops
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
