package com.BootCamp.practiceLearning;
/*
We going to discuss the superkeyword
	Now there two ways to use the super keyword
	One is with methods
	Other is with constructors
In today's example we are going to use super keyword with methods
    In this program we have a ChildClass also could be  called subclass
        We are going to inherit everything from the BaseClass
        We are going to inherit methods and variables that we define in the BaseClass
   Let us copy and paste the PrintSomething method over to BaseClass
        Change the Print Statement to "This was printed from the BaseClass"
        You will notice printSomething methods shows a problem saying you added method with name on the BaseClass
            The program is confused to which one to use
        when you run the program
            You get the statement from the childClass
            The reason is were are inheriting that method of the same name from the BaseClass
            The method  from the ChildClass gets precedence
            How do you get the method from the BaseClass to print
                That is when the super keyword comes in to play
                Let us type the super keyword after the method then dot then find the method
                   Super means that you want to use the method from BaseClass(super class)
                   This is a nice thing because you know where the method is coming from
                        You may write and come back to the code like a year later and wonder where the method is coming from
                        The super will tell you the method is from the BaseClass not the ChildClass
         We use the super keyword to override the method in ChildClass(Sub class) and go to BaseClass method(Super class)
                We remove System.out.println("Ths was printed from childClass");
                    Since we do not need to print it from the ChildClass anymore because we want to go ahead and  print out the method from th BaseClass
                    You can left it if you want to




 */
public class ChildClass extends BaseClass { /* also called subclass */
    public void printSomething (){
        super.printSomething();
        System.out.println("Ths was printed from childClass");
    }

    public static void main(String[] args) {
        ChildClass testsuper=new ChildClass();
        testsuper.printSomething();
    }


}
