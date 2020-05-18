package com.BootCamp.practiceLearning;
/*
    The main method is built method within Java
    The main method basically says to Java here is where the main program starts
            So everything we do all classes will make funnel into the main method
            That means this is where we start referencing and using them
            So the analogy like to use
                    think of it like a football game
                    We have one week to prepare foe the team that we are going to play
                    We have to build a game plan and playbook to use when the football game starts
                    So we go to our classes and create all of our code(we are planning what will use for our Main program whenever it gets executed)
                           We are preparing for the football game
                    Think of it almost as we have this playbook(main) of the classes that we created and now will start calling and using methods and variables when we want them
                    You want a new object of class A
                         ClassA newObj= new ClassA();
                         System.out.println(newObj.a);
                         Here we are printing out the object
                         Then you want to invoke one of the Class A methods
                         then repeat for Class B


 */
public class MainProgram {
    public static void main(String[] args) {
        ClassA newObj= new ClassA();
        System.out.println(newObj.a);
        newObj.sendMessage();

        ClassB newObj1= new ClassB();
        System.out.println(newObj1.b);
        System.out.println(newObj1.returnValue());

    }
}

