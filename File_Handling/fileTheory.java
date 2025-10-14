package File_Handling;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fileTheory {
    public static void main (String[] args) throws IOException {
        System.out.println("Enter a number:");

        /*
        //CONCEPT-1
        //This part gives ASCII value for an input (for a single char input)
        int num = System.in.read();
        System.out.println(num);
        //To get the desired number we can use:
        System.out.println(num - 48);
        */

        //CONCEPT-2
        //There is a concept called BufferedReader: is a class with io -> belongs to package java.io
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        //bf.readLine() would give you String; to generate integer output use Integer.parseInt()
        int num1 = Integer.parseInt(bf.readLine()); 
        System.out.println(num1);

        //CONCEPT-3
        //Scanner was introduced later in JAVA, people before that used BufferedReader
        Scanner sc = new Scanner (System.in);

        int num2 = sc.nextInt();
        System.out.println(num2);
    }
}
 