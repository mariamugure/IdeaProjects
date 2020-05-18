package com.BootCamp.practiceLearning;
/*
     Today we will look at the difference between primitive variables and reference variables
     We have been doing these all along in previous tutorials, I just did not explain the difference because we did not have a good understanding of what objects are
            By now we should now what objects are
        int x=10;
          We have called instance variable
            Because we get a new instance of this variable when we create our object
          We have called object variable
            Because is part of that object
          Now will deal with primitive variables
           A primitive variable is simply one of those data types that we always use, like int, char, double, short, long
           We give primitive variable  a specific value
                    Example
                             int x=20;
                             int y=x;
                             double decimal =5.5;
             What about objects though
                When we create a new object we are actually creating a variable(Road miles15=)
                Mile15 is a variable but we call it an object
                because we are assigning the equals
                        We are assigning what gets built by the constructor to the name(mile15)
                the actual long name is object reference variable
                        What does that mean
                        It means that mile15 is related to the object, but it not actually the object
                        It represents a way to get to the specific instance of that object
                        But remember we can several instances of the Road.java
                                but mile15 tells the program what instance to go to
                         I like think of it a like street sign
                                The street sign is not the actual road that you drive in
                                It is telling you that is the road that your are driving in, but is not the actual road
                                It is the same for objects
                                    mile15 is not actual object
                                    It represents a way to get to specific instance that object
                                    In the example
                                            we get our object on the right
                                            It is a Road object and it gets constructed (new Road())
                                            The mile15 name now is basically associates it with the Road object in memory
                                            Remember that object gets put into a memory and the actual memory is called heap memory
                                            The heap memory is where the actual object is located
                                            mile15 pointing and telling you that this actual object
                                                    A road may run thorough towns and each town may actually call that road a different name even though it the same road
                                                    You can create another object reference variable and not have to use the constructor
                                                           you will the class(Road) call it Maple  and put mile 15
                                                           What we did say Maple road value(its reference value) equals mile15
                                                           Maple road goes to the same object
                                             Another road variable
                                                But will invoke a new object of the road class
                                                The constructor will get invoked and it will built a new object of the road and place it in memory















 */
public class Road {
    int x=20;                //primitive variable, instance variable, object variable
                            // 1. declare 2. give name 3. assign a value
        int y=x;
    double decimal =5.5;

    public static void main(String[] args) {
        Road miles15=new Road();
        //object reference variable
        /*
        it represents a way to get to a specific instance of that object
         */
        Road Maple= miles15;

        Road Smith= new Road();
    }

}
