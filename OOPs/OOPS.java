package OOPs;

class Pen {
    String color;
    String type; //ball-point, gel

    //Method:
    public void write() {
        System.out.println("Writing Something!");
    }

    public void printColor() {
        System.out.println(this.color);
        //this -> keyword in java
    }
}

class Student {
    String name;
    int age;

    public void printInfo () {
        System.out.println(this.name);
        System.out.println((this.age));
    }

    Student() {
        System.out.println("Constructor Called!");
    }

    //Parameterised Constructor
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Student (Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        //Object Creation
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball-point";

        pen1.printColor();
        pen2.printColor();

        //Student Object
        Student s1 = new Student();
        // Student s1 = new Student("Ronaldo", 23); 
        /* whenever we use new keyword a new space is created in heap where the objects get stored. 
         * Student() -> a special type of function named Constructor in Java. Thry don't  return anything
         * i.e., they don't have any return type.
         * For 1 object, Constructor can be called only once.
        */
        s1.name = "Ronaldo";
        s1.age = 23;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();
    }    
}
