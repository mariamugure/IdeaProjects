package com.BootCamp.practiceLearning;
/*
Today we are going to look at the lifecycle of the object
	More specifically how the object gets created from start to finish
	I have created three classes:
		The childClass1 that extends MiddleClass
		    To point something out, people get confused the superclass of this ChildClass1.java is actually MiddleClass.java is not actually the SuperClass1.java
		The MiddleClass superclass is SuperClass1.java
		Then everything ends up in SuperClass1.java
     Lets walk though this entire process because this is really critical if you are going to become a professional object oriented programmer
       So ChildClass1.java and go to bottom of the code where we find the new keyword
       The new keyword invokes our constructor and then ChildClass1.Java constructor kicks off
                What is going to happen here the constructor will get executed
                then it sees the extends keyword and will go MiddleClass.java and pass control to the MiddleClass.java
                    This is implicit call to the superclass(MiddleClass) since there is not super in ChildClass1.java
                then the MiddleClass.java constructor gets invoked and executed
                then it sees the extends keyword and will go SuperClass1.java and pass control to the SuperClass1.java
                    This is implicit call to the superclass(SuperClass1) since there is not super in MiddleClass.java
                Then SuperClass1 constructor will get executed to and start everything else off and it will built the SuperClass1.java portion of the object
                    Then all variables and methods will be placed into object
                When the SuperClass1.java is done it will go back to MiddleClass.java
                Then MiddleClass.java constructor will be executed and it built MiddleClass.java portion of the object
                    Then all variables and method will be placed into object
                Then finally we end back where we started at the ChildClass1.java constructor
                    Then ChildClass1.java constructor will do its work and built the ChildClass1.java portion of the object
                In the example, we set x=50;
                    Then 50 will be assigned to the variable x
                    And the result of it begin assigned to X, it will be initialized
                All of the work is done we have our final object
                    The object is now in memory
                Then we can go to the main method and we  can start using them
                    The object can start doing its work
                How we can do a call to the object
                    We do the System.out.println and print the contents of method from our newly created object
                    Now the object can do its work now and do the things we want it to do down here in the main
 */
public class ChildClass1 extends  MiddleClass {
    private int x;
    public ChildClass1 (){
        x=50;
    }
    public int returnSomething(){
        return x;
    }

    public static void main(String[] args) {
        ChildClass1 testObj= new ChildClass1();
        System.out.println(testObj.returnSomething());
    }
}
