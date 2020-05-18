package com.BootCamp.Package1;
/*
Access modifiers
	first create two packages and both have a program A(First package) and program B(second package) which are identical
      Both programs are accessing methods and variables from class template in package 1
	The reason both programs are the same is just talking about the keywords
 	Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors.
	The four are:
	        Default
	            When no access modifier is specified for a class , method or data member
	            The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible only within the same package.
	        Public
                Classes, methods or data members which are declared as public are accessible from every where in the program.
                There is no restriction on the scope of a public data members.
	        Private
	            usually used in variables
	            The methods or data members declared as private are accessible only within the class in which they are declared
	        Protected
	            usually used in variables
	            This is about inheritance
	            The methods or data members declared as protected are accessible within same package or sub classes in different package.
	  Classes can only use two of the accessors
	        It uses default and public
	        if remove the public from the class it becomes default
	            The class now is only available to package it belongs
	                In this example is programA
	              If you go to package2
	                class ProgramB
	                         it tells ClassTemplate is not public in package
	          If are trying to access a class that is in another package
	            you always have to use the import feature
	         Most classes are public

	         When you go program A and run the program how does it run if it has a variable(year) is private
	            Because the method called is public the program can run and the method can access the variable
	            Most developers will make the variables private and the method public
	                Developers do not want people messing around with their variables
	            If you go to program A or B and decide to go ahead object. and see how many variables can be seen
	         How the access modifiers work with methods
	            If you go program and run it, it runs
	               It runs because program B has access to the method from ClassTemplate.java since it set to public
	               if you remove public(default)
	                    program B will not run since ClassTemplate is not the same package
	                    program A will run since ClassTemplate is in the same package as program A




 */
  public class ClassTemplate {
     int day=1;
     public int week=7;
     protected int month= 31;
     private int year=365;

  public int printWeek(){
         return week+ day+month+year;

     }
   }
