package Array;

import java.util.Scanner;

public class array2dOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Array declaration
        int[][] matrix = new int[rows][cols];

        System.out.println("Input the Elements of Matrix: ");

        // Input elements
        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to be Searched: ");
        int num = sc.nextInt();

        System.out.println("The Matrix is: ");
        // Print Elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Searching elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == num) {
                    System.out.println(num + " is at Index: " + "(" + i + "," + j + ")");
                }
            }
        }
    }
}
