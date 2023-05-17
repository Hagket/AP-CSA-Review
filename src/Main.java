import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println("----------------------");

        // 1) what would the following lines of code print://
        // a)
        System.out.println(10*7/4-5);

        //Answer:
        System.out.println("----------------------");

        // b)
        System.out.println(4 + "May" + 1 + 5);
        //Answer:
        System.out.println("----------------------");

        // 2) Write a for loop that will sum the integers 1-10 (Answer: 55)


        System.out.println(sum);
        System.out.println("\n----------------------");
        // 3) Write a while loop that will sum the integers 1-10 (Answer: 55)


        System.out.println(sum1);
        System.out.println("----------------------");
        // 4) Initialize an array of ints to {6,7,8,9,10}

        System.out.println("\n----------------------");
        // 5) Initialize an array of Strings to 3 elements

        System.out.println("\n----------------------");
        // 6) Write a for-each loop that will print each item in an array of ints

        System.out.println("\n----------------------");
        // 7) Write a class called Bear with instance variables int age, String color, and String type. Write a constructor for the class that sets each of the instance variables. Then write a method boolean isScary() that should return true or false based on the type and age of the bear. (Work done on Bear.java file)
        Bear mgo = new Bear(50, "Black", "Black Bear");
        System.out.println(mgo.isScary());

        System.out.println("----------------------");
        // 8) What will the method call fun(k) return?
        int[] k = {4,9,10,8,3};

        //Answer:
        //System.out.println(m.fun(k));

        System.out.println("\n----------------------");
        /*
        9) Complete the following:
        Initialize an ArrayList of Integers
        Add the integers 5, 10, 9, 13, 54 to the ArrayList
        Remove the third item of the list
        Add 6 to the end of the list
        Set the int at index 3 to 32

        Answer:
        */


        for (int x : ints){
            System.out.print(x + " ");
        }

        System.out.println("\n----------------------");
        /*
        10) Write the following methods: (In codingBat)
        hasBad (found in String-1)
        countHi (found in String-2)
        middleWay (found in Array-1)
        */

        System.out.println("CodingBat");
        System.out.println("----------------------");
        // 11) Given the method defined below what does the following print mystery1(4,3);

        //Answer:
        System.out.println(m.mystery1(4,3));


        System.out.println("----------------------");
        // 12) What is the result of each of the calls listed on the right? (Classes: Base & Derived)
        // a)
        Base a = new Derived();
        a.methodOne();
        //Answer:
        //Work:

        System.out.println("\n----------------------");
        // b)
        Base b = new Base();
        b.methodTwo();
        //Answer:
        //Work:

        System.out.println("\n----------------------");
        // c)
        Derived c = new Derived();
        c.methodOne();
        //Answer:
        //Work:

        System.out.println("\n----------------------");
        // d)
        Base d = new Derived();
        d.methodThree();
        //Answer:
        //Work:


        System.out.println("\n----------------------");
        // e)
        Based e = new Derived();
        e.methodTwo();
        //Answer:
        //Work:


        System.out.println("\n----------------------");
        // 13) Given the method defined below what does the following return: mystery("xyzxyxy");

        //Answer:
        System.out.println(m.mystery2("xyzxyxy"));

        System.out.println("----------------------");
        // 14) What will print when the following code is executed?
        int b1 = 5;
        String list = "";
        while(b1<11)
        {
            b1+=2;
            if(b1%2==1)
            {
                list = b1 + " " + list;
            }
        }
        System.out.print(list);
        //Answer:

        System.out.println("\n----------------------");
        // 15) What will print when the following code is executed?
        String firstName = "Sofia";
        String middleName = "Maria";
        String lastName = "Hernandez";
        String initials = firstName.substring(0,1) + middleName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initials.toLowerCase());
        //Answer:

        System.out.println("----------------------");
        /*
        16) Which of the following expressions is equivalent to !(c || d)?
        (A) (!c) && (!d)
        (B) (c || d)
        (C) (c && d)
        (D) !(c && d)
        (E) (!c) || (!d)

        Answer:
        */

        System.out.println("\n----------------------");
        // 17) How many times does the following code print "*"?
        for (int i=3; i<8; i++)
        {
            for (int y=1; y<5; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Answer:
        //Work:

        System.out.println("----------------------");
        // 18) What will print when the following code is executed?
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Anaya");
        list1.add("Layla");
        list1.add("Sharrie");
        list1.set(1, "Destini");
        list1.add(1, "Sarah");
        System.out.println(list1);
        //Answer:
        //Work:

        System.out.println("----------------------");
        // 19) Go to Dog.java & Kennel.java files
        Kennel bob = new Kennel();
        System.out.print("John was added to index: ");
        System.out.println(bob.addDogToKennel("John", "Moses"));
        System.out.print("James was added to index: ");
        System.out.println(bob.addDogToKennel("James", "Viken"));
        System.out.print("Jacob was added to index: ");
        System.out.println(bob.addDogToKennel("Jacob", "Mardiros"));
        System.out.print("Jamar was added to index: ");
        System.out.println(bob.addDogToKennel("Jamar", "Mardiros"));
        System.out.print("Joe was added to index: ");
        System.out.println(bob.addDogToKennel("Joe", "Mardiros"));
        System.out.println();
        System.out.println("Jamar has been found: " + bob.findDog("Jamar"));
        System.out.println();
        System.out.println("# of Mardiros' dogs removed: " + bob.removeDogs("Mardiros"));
        System.out.println();
    }
}