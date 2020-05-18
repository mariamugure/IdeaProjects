package com.BootCamp.practiceLearning;
/*
      When you run code, you run it in the main method
A method run code inside of the curly braces
TO make a regular method
	Example
		first the name of the method which is sayHi
		But we need to specify the return type
		if you do not to try anything you put void
		All a method does is run code inside the curly braces

			example

		void sayHi{
			System.out.println("Hi");
}
	       When we run this nothing happens
			That is because there is nothing in the main method
			The main method let us control the code we want
			If we want to use the sayHi method
				We have to call it inside the main method
				    When you just call the method like this
				        sayHi();
				        It tells you there is a problem
				            Non static method sayHi() cannot be referenced from a static context
				            You can solve that by making the sayHi method static
				            Then run the program which prints Hi
				               When we click run we are running the code in the main method curly braces
				               In the example, we see a method called sayHi called in the main method
				               The Class(Main) can see a method called sayHi
				                    Then we run code inside the curly braces
			Wht are there the String[] args inside the main method parenthesis
			    	       When we have arguments in a regular method
			    	       Example
			    	            Make a method called saySomething that passes a String S
			    	            In the main method we call the saySomething method and "hey"
			    	            We know how a regular method uses parameters
			    	                You call the method then you pass parameter which run code inside the method(saySomething)
			    	                Since the parameter you call is hey
			    	                    Hey is passes into saySomething method as the String S
			    	             Now does the parameters apply to main method
			    	                The first in main method parameters is a String array or an array of Strings
			    	                        How do use a array of strings in a regular method






 */

public class MainMethod {
    public static void main(String[] args) {
       sayHi();
       saySomething("Hey");
    }
      public static void sayHi(){
        System.out.println("Hi");
    }
    public static void saySomething(String s){
        System.out.println(s);
    }
}
