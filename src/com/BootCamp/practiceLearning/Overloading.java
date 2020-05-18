package com.BootCamp.practiceLearning;

/*
    Today were are going to talking about overloading a method and overriding a method
    When you overload a method that involves having two methods with the same name but different argument lists
        The other key point it always within the same class inheritance and polymorphism is not involved here
        Again same class, same method and different arguments
            That is what defines the overload
            the return type may be different or the same
            public double multiply (double a, double b, double c) is a overload
             public int multiply (double a, double b, double c) is not overload
    Why do you need an overload
        May be you like the name of the method multiply and you want to use it over and over again, it may be easy to understand
            If you do not want the same name you can change the name of the other methods
            Java is how you prefer to do it
                    If want the same method and to overload then you can do that as well
     Overriding a method is a little bif different
        We are going to get into that more of overriding method latter
        Overriding a method involves inheritance
        So if we have a superclass and we create a method in that superclass(example int addInt())
            In our subclass, we create another method(int addInt ()) with the same name
                We have to use the same arguments and the same return types
                They have to match what is in the superclass otherwise you are no longer overriding the class



 */
public class Overloading {
    public int multiply(int a, int b){
        return a * b;

    }
    public double multiply(double a, double b, double c){
        return a * b * c;
    }

    public static void main(String[] args) {
        Overloading testObj= new Overloading();
        System.out.println(testObj.multiply(12,13));
        System.out.println(testObj.multiply(12.2,13.5,14.5));

    }


}
