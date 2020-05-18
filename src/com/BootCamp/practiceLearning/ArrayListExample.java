package com.BootCamp.practiceLearning;


import java.util.ArrayList;
import java.util.Arrays;

/*
    Let's start with make a regular array
            public class ArrayList {
                    public static void main(String[] args) {
                        String [] fruits= new String [3];

                        fruits[0]="Mango";
                        fruits[1]="Apple";
                        fruits[2]= "Strawberry";

                        System.out.println(fruits[0]);
                        System.out.println(fruits[1]);
                        System.out.println(fruits[2]);

           Let do the same example but now with ArrayList
                type ArrayList with name fruitList then equal sign and new ArrayList();
                Then you fruitList.
                    The dot brings up all the things that th ArrayList can do
                    We will use the add

                      ArrayList fruitList= new ArrayList();
                                 fruitList.add("Mango");
                                 fruitList.add("Apple");
                                 fruitList.add("Strawberry");
                                System.out.println(fruitList);
             ArrayList are more flexible and Array are not
                You can add and remove indexes quickly from ArrayList
                    Example can you quickly add watermelon to the ArrayList
                        fruitList.add("Watermelon")
                    You can remove one item from ArrayList or all the items
                        fruitList.remove("Apple")   one item removal
                        fruitList.clear()   removes all the items
                    You can check to see what is contained in the ArrayList
                            You can check if there is raspberry
                            however, we need to put it in a system.out.println to get a true or false
                for the Array
                  in the example
                    Add fruit[3]= "Watermelon"
                    Then remember to increase the element number
                        increase [3] to [4]
                   You want to know the array list before you build the array
            Example where ArrayList are used
                When people subscribe and unsubscribe to a youtube channel grow and shrinks everyday

 */
public class ArrayListExample {
    public static void main(String[] args) {
        String [] fruits= new String [3];

        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]= "Strawberry";

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(Arrays.toString(fruits));

        System.out.println("-------------------");


        ArrayList fruitList= new ArrayList();
         fruitList.add("Mango");
         fruitList.add("Apple");
         fruitList.add("Strawberry");
         fruitList.add("Watermelon");
         fruitList.remove("Apple");
         fruitList.clear();
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);
    }


}
