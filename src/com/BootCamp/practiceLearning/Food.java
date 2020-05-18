package com.BootCamp.practiceLearning;
/*
Today we will look at methods, specifically the void and the return methods
We have already seen the void keyword when we public static void main(String[] args{}
     Void means that it will not return a value
     Return on the other hand will return a value
class is the template for objects
    Let us go ahead and create a  String variable called foodA;
        remember in the previous tutorial when we talked about access modifiers, We indicated that is a good habit make your variables private, unless you have a good reason to make it public
            We will access the variables through the public method
     After creating the variable, create an constructor and pass un a stringA
        When it calls string a
        In the curly brackets we will give this constructor a value
            foodA=A;
            if you remember we do not actually assign the value here
                The constructor gets build or used when we use it as object in different class
                The A is like a fake value
      After creating the constructor, create a method
            will create a method to explain  return work
            remember that we want the method public so we can access if from the main program(HamburgerJoint.java) and the variables that are private since they are in the same class
            the method will return a String value
                The name of the method will be getFood()
                    need parenthesis to declare this as a method
                Then will return foodA
                If put void after public and still have return will not work
                    they are opposite of each other
                    but since we are returning value, we specify what return is which in the example is String
          Let us also create a void method
            We use the keyword void
            We are gonna call this method systemPrint
                We are just gonna do a system print value from foodA=A;
 */

public class Food {
    private String foodA;
    public Food(String A){
      foodA=A;
    }
    public String getFood(){
        return foodA;
    }
    void systemPrint(){
        System.out.println(foodA);
    }


}
