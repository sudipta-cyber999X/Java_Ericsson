/*
 * Tower of Hanoi Problem! 
 */

package RecursionTwo;

public class RecursionOne {
    public static void towerOfHanoi (int noOfDisks, String src, String helper, String dest) {
        if (noOfDisks == 1) {
            System.out.println("Transfer Disk "+noOfDisks+" from "+src+" to "+dest);
            return;
        }
        //For first n-1 disks
        towerOfHanoi(noOfDisks-1, src, dest, helper);
        System.out.println("Transfer Disk "+noOfDisks+" from "+src+" to "+dest);
        towerOfHanoi(noOfDisks-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int noOfDisks = 3;
        towerOfHanoi(noOfDisks, "S", "H", "D");
    }
}
