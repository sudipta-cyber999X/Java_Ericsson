package Sorting;

public class sortingThree {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 5, 10, 9 };
        
        //Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }

        //Print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
