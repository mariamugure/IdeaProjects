package com.BootCamp.ThirtyDayOfCodeHackerRank;
/*
        We are going to create a blueprint for car
        Blueprint for real life objects is class
        Classes have proprieties and methods
        Proprieties define the object, in this case car
        Some proprieties of car include maximum speed, minimum speed, weight of the car, if the car is on or off, the condition of the car
        How do represent the proprieties of object( or car in code)
            We use data types
                The first is the primitive data type
                    Most basic data type
                    Contain three main things
                         Numbers
                            Example the speed of the car
                            Java uses the following number data types
                                Integer
                                    int is the short hand
                                    int represents negative and positive whole numbers
                                    We can use int maxSpeed to define the speed of the car(object)
                                Double
                                    Represents decimal numbers
                                    This is the default for decimal values
                                    we can use double weight to present the weight of the car in decimal
                                Float
                                    Represents decimal numbers
                                    float represents smaller numbers than double

                                 Boolean
                                    Boolean is used for true(yes) and false(no)
                                    We can use boolean to first out if the car is on and off
                                    The property(isTheCarOn) is evaluated as true of false
                         Characters
                            Represents the characters
                            But can only using a single character
                            Example we can use characters to represent the condition of the car
                         The equal sign is used in java as assignment operator
                            Example int maxSpeed=100;



        The method
            The method is also called functions
            We can create functions to check the properties
                Example is public void printVariables()
                    printVariables is the name of the function
                    We are going to print the variables in the console
                        The console is the window in the bottom of the screen using System.out.println();
                    After writing the System.out.println() for each variable
                        if you run the program nothing will happen because we are not calling the method
                            How do we call a method
                                We have to create the instance of a car class in order to call it
                                At the moment  we have a car entity, we have the plans to make a car but we do not actually have a car yet
                                We can do this by creating a instance of car in the main method
                                    Have Car(class) then name you creating in that instance then the equal sign then  new car
                                        This will create new instance from our blueprint class(car)
                                        Here we are creating new object carry
                                Then on use carry.
                                    The .dot will call the method
         Reference data type
            The another type of data type
            The reference type does a shared copy
            Example you have a car that is shared by multiple owners
            Each time you reference the car from any of the owners you want it to be the same car
            If one of the owners of the car paints it blue, if access the car from a different family member you want it to blue
            It is the same instance of the object
            In the example, we can change the variable name carry to familyCar
            The familyCar will stand for the family car that the whole family owns
            Example Alice is a family member
                the family car is also her car
            Let us change something about the family car
                We can use a method to do that
                Let us say the a different family member wrecks the car
                The condition has changed from the good condition from A
            When we call wreckCar() method to the familyCar object the condition will change from A to C
            Then when you call aliceCar it will also change from A to C
            The above example only works for reference types and not primitive data types
                if you try the following
                    public void upgradeMinSpeed()
                        Example you want this method to change the  original max speed to the min speed
                        then add 1 to the max speed
                        When you print the min speed is 100 and max speed is 101
                        When we changed the max speed to 101 the min speed did not change
                            unlike when we used the reference type that changed when one changed
            Examples of reference types are
                Arrays
                Queues
                Linked lists
                Stacks
                Strings
                The above are data structures



        Programmers use camel case to easily read the name of the propriety or method
 */

import java.util.Scanner;

public class Car {
     int maxSpeed=100;
      int minSpeed=0;
     double weight=4079;
     boolean isTheCarOn=false;
     char condition='A';
     String nameOfCar="lucy";

    public  void printVariables(){
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the minSpeed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("This will determine if the car is on or off " + isTheCarOn);
        System.out.println("This is for the condition of the car " +condition);
        System.out.println("This is the name of the car "+ nameOfCar);

    }
    public void wreckCar(){
        condition='C';

    }
    public void upgradeMinSpeed(){
        minSpeed=maxSpeed;
        maxSpeed=maxSpeed+1;
    }
    public static void main(String[] args) {
        Car carry=new Car();
        carry.printVariables();
        Car familyCar=new Car();
        familyCar.printVariables();
        Car aliceCar=familyCar;
        familyCar.wreckCar();
        aliceCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
        aliceCar.printVariables();



    }

}
