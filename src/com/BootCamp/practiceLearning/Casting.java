package com.BootCamp.practiceLearning;
/*
    What is casting
        Casting is converting
        We are converting variables and objects
        More specifically we are converting tha data types associated with those
            The data types include byte, char, int float, long, short, string, double
            Before we declared a data type and that was it
                We did not convert anything

    There four main types of conversions
        1. You can convert an object into another object
        2. You can covert a simple variable into another type of variable
       3. You cna also use an object to create a simple variable
       4. You can use a simple variable to create an object
   Converting information to a new form is called casting
        Casting produces a new value that is different type of variable or object than its source
            You are not actually changing the value, you are just converting into a new data type or format that you need
    Lets start casting
        Will start with casting simple variables to simple variables
                lets convert a decimal to a whole number
                        double source= 150.05;
                            double is a decimal point
                        int destination =()
                                now we are going to do cast whole number
                                int is a whole number
                                in the parenthesis is where we do the cast
                                    We specify  that data type that we want to in the parenthesis then specify the object
                                    When you convert the double to int it does not round up


                                              public class Casting {
                                                public static void main(String[] args) {
                                                    double source=150.57;
                                                    int destination=(int) source;
                                                    System.out.println(source);


                                                            }
                                                        }


               Lets convert another variable to variable
                      In the example below we converted the int to byte and got the same number
                        in this example I want to point that these data types here ranges of value
                            If you go past the range you got a wrong output
                       When you are doing a cast from one ata type to another you have aware about the ranges of the data types you are working with
                                If you have a number than not in the range
                                Here Java assumed that you know what your are doing , so Java will try and refactor and work it out
                                            public class Casting {
                                                public static void main(String[] args) {
                                                   int I= 125;
                                                    byte B= (byte) I;
                                                    System.out.println(B);

                 Now will work with objects
                     (A)How to move values from one object to a variable and vice versa
                        Will start with moving a objects value and put that into a variable
                            We will declare a new object here
                                Integer WholeNumber =new Integer(400);
                             Let us define the variable that we going to dump this number into
                                In this example we use int
                                        We cannot use the traditional way of casting
                                                In variable to variable
                                                        int I= 125;
                                                         byte B= (byte) I;
                                       Objects do not work that way, you cannot one to one
                                           You have the classes methods in order do to the conversion
                                           int dest(the name of the variable)=name of the object. intValue()(method)
                                                intValue() is method that we are pulling from the Integer to allow us to convert
                                                    This method is coming from the Integer class
                                                        This is pre-canned class from Java
                                                        We are suing the method(intValue) from the Integer class
                                                      public class Casting {
                                                            public static void main(String[] args) {
                                                                Integer wholeNumber= 400;
                                                                int dest= wholeNumber.intValue();
                                                                System.out.println(dest);
                                                                you cannot write Integer WholeNumber= new Integer(400) because Integer is a class defined by Java
                                                                The java.lang.Integer.intValue() is an inbuilt method in java that returns the value of this integer as an int.



                       (B) Converting a variable to an object
                                Let us do a String this time
                                lets take a value from a String and let us turn that into a Integer(object)
                                    we call the String variable(val) and equal to and lets give number "47"
                                    lets declare our intObject
                                        again we have to use a method to do to use the Integers method to convert

                                                    public class Casting {
                                                            public static void main(String[] args) {

                                                               String val= "47";
                                                               int intObject= Integer.parseInt(val);
                                                                System.out.println(intObject);
                                                                While operating upon strings, there are times when we need to convert a number represented as a string into an integer type.
                                                                The method generally used to convert String to Integer in Java is parseInt().
                                                                        This only works for numeric strings
                         What is the difference between explicit casting and implicit casting
                            Up to now we have been doing explicit casting
                            In the variable to variable example
                                we said convert (byte) I to byte
                                    We we mean by explicit is that we can see that is doing that
                                    we are explicitly saying you want you to convert to to a byte
                                    explicit is something you can see that we are doing
                              implicit casting
                                    Implicit casting is where you remove the parenthesis
                                    public class Casting {
                                            public static void main(String[] args) {
                                               int x=46;
                                               double y=3.5;
                                               double xy= x + y;

                                                System.out.println(xy);
                                     let me explain what is happening here,
                                       notice we added an arithmetic in double xy
                                       At the time that X and Y get added, the x has to be converted to a decimal
                                            That is an implicit cast







           All the basic data types of Java have corresponding object
                The data type int has a corresponding object Integer that you can reference
                The same for the other data types












 */



public class Casting {
    public static void main(String[] args) {
       Double Maria=500.06;
       int Gabu=Maria.intValue();
        System.out.println(Gabu);













    }


}
