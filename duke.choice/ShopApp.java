package duke.choice;

public class Clothing {
       
}

public class ShopApp {
    public static void main (String[] argd) {
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description =  "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;

        System.out.println ("Item-1: " + " " + item1.description + "," + item1.price + "," + item1.size);
    }
}