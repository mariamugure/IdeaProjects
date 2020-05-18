package com.BootCamp.practiceLearning;
/*
    In the last tutorial we dealt with the super keyword and methods.
    In this tutorial we are going to deal with constructors
        We are kicking off the new object(testSuper) and using the the new keyword
        We are going to the constructor (SubClass (1,2) get kicked off
            But we are we are extending the SubClass(is the child of the SuperClass) with SuperClass
        Then we come down to the constructor
            Then we will invoke the Super's constructor first
                    Whether we do that or not the Super constructor always goes first
                    It is very critical that you understand that point
                    The super classes constructor always constructs the superclass first then the sub class constructor goes after the super constructor
                    Then super class constructor and rhe sub class constructor gets merged into the object
                    If you do not put thr super then it becomes an implicit super class
                            But in this case we want to go ahead and pass the variables (3,4) through the super class constructor and  assign them to variables in SuperClass.java
                            I want to point out, remember that the super class constructor always goes first
                                If you drag to the bottom, we get a problem
                                    It say that the super() must be the first statement in th constructor body
                                    You are getting that problem because the program thinks you are trying to execute the subclass constructor first
                                            The program tells you they they cannot do that
                                            It must be the first statement in the sub class constructor
                                                The constructor calls the super by passing a three and four over the super class constructor (SuperClass.java) through two local variables (XX, YY) then assign them to the parenthesis then assign to the variables c and d then the constructor will get built then it will go the sub class constructor the values are assigned to the local valuables then get passed  to parenthesis  then assigned to variables a and b
       You can go to the SuperClass.java and remove the parameterized constructor leave the default constructor
             The come and remove 3 and 4 from the parenthesis is super
             If you do not you will a problem
       Super () is a explicit call
             If you remove the super(); it will be implicit call
             This will still get done, the superclass constructor goes ahead and builds the portion  of the object and that will be merges into what the sub class constructor builds
       How does  subclass and superclass come  together to make the object
              The superclass gets invoked first whether we have it on the subclass constructor or not then subclass goes and goes and perform whatever is supposed to do
                    Then both part of the object that is inheritance
                    Then we use all the superclass all the methods and variables that we inherited
                    If remove the extends SuperClass
                        Remove also
                          super()
                          System.out.println(testSuper.a);
                           System.out.println(testSuper.b);
                       Then it becomes a standalone object
                            It is no longer inheriting anything







 */
public class SubClass extends SuperClass {
    private int a ;
    private int  b;

    public SubClass (int x, int y){

        a=x;
        b= y;

    }

    public static void main(String[] args) {
        SubClass testSuper= new SubClass(1,2);
        System.out.println(testSuper.a);
        System.out.println(testSuper.b);


    }
}
