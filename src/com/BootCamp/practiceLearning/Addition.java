package com.BootCamp.practiceLearning;
/*
Constructors can be confusing at first but once you grasp the concept they can be very useful
Let take a look at them right now
In the last couple of tutorials we defined an object called PlanetObject.Java and the created a blueprint for it
We then created a program called AllPlanets where we can create objects of our template
	We created an earth object off our planet template
Now what a constructor allows you to do is instead of having to write out this variable here,(Earth.size=25,000;) it allows you to define it one the fly through the parenthesis (PlanetObject Earth =new planet ();)
	Think of it as a quick shortcut
	An easier way to define your variables on the fly
	You do not have to type them all out
This way is easier(Earth.size=25,000;) if you are only defining a few objects
	But if you are defining dozens of objects, it makes sense to  type the variables in the parenthesis
There are several ways to do constructors
	In this tutorial we will see the two basic constructors
        In later tutorials I will sho you a more advanced too constructors
Let us go ahead and set up our template in Addition.Java
    Then we will set up our variables
        int firstNumber;
        int secondNumber;
     Then we need a method
        We will create a method that just adds those numbers
        At this point, if we go back to PlanetObject.java, you will notice it very similar(we set our variables and we set up our method)
            So it is the same thing at this point
                What is difference now we will set up the constructors in our template that we can call from addition program
                    So let go ahead and set up the constructors
                        We name the constructor the same name as the class name(Addition) with open parenthesis
                            Now you might be asking well that is what we do with a method
                            A constructor is a type of method
                         Now we can go ahead and define values for the variables
                                        This is called a default constructor and this is where you just go ahead and write out the values for the variables
                                            Addition(){
                                                firstNumber=10;
                                                secondNumber=20;
                                         We will create another type of  constructor
                                            We type the same name as the class (Addition) with parenthesis
                                            In the parenthesis we will type int L, int B
                                                I will explain this in a second
                                             firstNumber is assigned L(firstNumber=L;)
                                             secondNumber is assigned B(secondNumber=B;)
                                             Now in this second constructor, we did not  give this any values like in the default constructor
                                                In this constructor we want to be able to assign whatever value we want
                                                we will assign the values when we create the objects in the program we will run(Addition program)
                                              The reason we gave the weird letters in the constructor because we did not want to give this a numeric value
                                                           Because you want to put any value
                                                           The letters are placeholder for the value
                                                           The first int L corresponds to firstNumber(remember is can be any letter)
                                                           The second int B corresponds to secondNumber
                                                           ( int L, int B) this also initializes the variables to used by the object created in AdditionProgram.java(addObject)
                                                                We also assign the value (firstNumber=L; secondNumber=B;) but again we are not going put in an actual value
                                                           notice we did not put anything before your constructor
                                                                That is because nothing is getting returned here
                                                                The return values are in the AdditionProgram.Java
                                                How come Java does not throw an error because we are using the same for both types of constructors
                                                    The answer is pretty simple
                                                    Now remember we said that the class name has to match the constructor name
                                                    The uniqueness of the constructor is determined by what is in the parenthesis
                                                        The arguments that we put in the parenthesis are what determine what the second type of constructor unique








 */

public class Addition {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public int getnumber(){
        return (firstNumber+secondNumber+thirdNumber);
    }

    Addition(){
        firstNumber=10;
        secondNumber=20;

    }

    Addition( int L, int B){
        firstNumber=L;
        secondNumber=B;

    }
    Addition(int X, int B, int C){
        firstNumber=X;
        secondNumber=B;
        thirdNumber=C;

    }





}
