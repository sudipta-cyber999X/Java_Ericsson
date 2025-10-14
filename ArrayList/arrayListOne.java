package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListOne {
    public static void main(String[] args) {
        //Integer Class, int ArrayList can't be created:
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get elements [.get(index) method]
        int element = list.get(2);
        System.out.println(element);

        //add elements in between [.add(index, element)]
        list.add(1,4);
        System.out.println(list);

        //set element
        list.set(0, 1);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //Total elements in ArrayList (.size())
        System.out.println(list.size());

        //Loops in ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sorting: 
        Collections.sort(list);
        System.out.println(list);

    }
}
