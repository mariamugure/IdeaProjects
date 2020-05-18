package com.BootCamp.practiceLearning;
/*
  We will be looking at Arrays
  Arrays are variables
  The difference is that the are bunch of variables that are grouped together under a common name
  If you wanted to do multiple variables you can do it under one name
    It is kind of like short way to do that
  You can create arrays the same way you create variables
    and the same type of information that is stored in a variable can also stored in an array
    The same data types used by variables are also used by arrays
        When we say that arrays have the same data types with variables
            we can do String arrays
            we can do single character arrays
            We can do byte arrays
            all the data types can used in arrays
  Arrays use square brackets to declare(or define) it as an array
  When you create arrays they should be in groups of created variables
        Example water and oil do not mix
        You cannot have water and oil variables together in an array


  In the example people
   after the data type( in the example int) put square brackets
   then declare the variable(in the example numbers)
   In the next line add the name of the variable=new
   Then we have to specify how different items will be stored in the array
        The items stored are called elements(they are basically variables
        After the new you add int[], but know in the square brackets you see how many elements will be stored in the array

   a shorter to make a Array
        public class Arrays {
    public static void main(String[] args) {
        String[] candy= {Hard Candy,Sour,Taffy,Fudge, Stick Candy};
          System.out.println(candy[2]);




 */
public class ArrayExample {
    public static void main(String[] args) {
        String[] candy;
        //here we declared the array
        //this is essentially a int array variable
        candy = new String[5];
        //here we are saying this array numbers is going to have 5 elements or 5 variables
        //here we specified how many elements are going to be stored in the array
        //you cannot mix data types from where you declared the array to when specifying how many elements to be stored in tha array

        candy [0] = "Hard Candy";
        candy [1] = "Sour ";
        candy [2] = "Taffy";
        candy [3] ="Fudge";
        candy [4] = "Stick Candy";
        // after  specifying how many elements are stored in the array, you then create all the int variables in tha array and their values
        //you start out with the array name(which is numbers in this example)
        //The reason we use the array name here is because we are storing all the elements under common array name which is numbers in the example
        //you put a square bracket after the array name
        //The zero identifies tha variable and it always starts with zero then assign a value
        //the zero or the numbers that go in the square brackets are called index

        System.out.println(candy[2]);
        //you the name of the array(in our case is numbers then the brackets
        //in the brackets you put the index of the element(also called variable)
    }
}
