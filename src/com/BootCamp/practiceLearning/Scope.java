package com.BootCamp.practiceLearning;
/*
  We talking about variable scope within methods
  When you create a variable or an object inside a method it is usable only inside that method
        That is what variable scope
  The scope is a block within a variable exists in program
  All the variables and objects that you create inside that method will only be available to that method
  If you want to be available to other methods, you have to define they outside of the method in the class itself
  The curly brackets is where the variable scope is set
        Everything within the curly brackets in particular method are local to the method only
        So if define a variable in the curly brackets of the method, it accessible only to everything inside the method
        And that is why is called a local variable
        If put the variable outside of it it becomes available to all methods in the class
        Everything inside the method is considered to be out of scope, it unreachable
        Every variable or object defined outside of the method is considered to be in scope and it available to any other methods


 */
public class Scope {
     static int number=7;
    public static void main(String[] args) {
        int number=7;   //this is a local variable(declared and initialized it), it is local variable because it contained public static void main(String[] args) {} block. No other methods will be able to reach it
        System.out.println(number);

    }
  static void getNumber(){      //creating a new method and trying to explain scope
      System.out.println(number);   // it tells us that cannot resolve symbol "number" then we  place the variable outside the method, but still not work because the method is static and variable is not(the program tells you that non static field 'number' cannot be referenced from a static context
  }
}
