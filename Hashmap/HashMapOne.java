package Hashmap;

import java.util.*;

public class HashMapOne {
    static void HashMapMethods() {
        //syntax
        Map<String, Integer> mp = new HashMap<>();
        //Adding Elements
        mp.put("Akash", 21); 
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18); //Here we could use the for-loop to do the samething.

        //Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); 
        System.out.println(mp.get("Rahul"));
        //get -> returns value, if key exists OR null, if key doesn't exists

        //Changing/Updating the value of key in HashMap
        mp.put("Akash", 25); //Updates Akash -> 25; as KEY is always Unique!

        /*
         * put -> Used for: 
         * insertion: if key doesn't exist
         * updation: if key exists
         */

    }
}
