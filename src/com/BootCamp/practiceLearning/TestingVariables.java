package com.BootCamp.practiceLearning;
/*
#What are variables
#A variable is basically the way that the computer remember
something as runs your program
# Name the variable and also give the information that variable will store
#Basically a variable stores information
#There three things you have to do with a variable
    1. You have to declare the variable
            You have tell it what type is
            In this example we are declaring int(which is a whole number)
     2. You have to give it a variable name
            In this example is Touchdown
            You can refer to this variable later on
            Remember that statements end with a semicolon
      3. Then assign a variable a value
             Refer to the variable name you created(Touchdown
             Then use an operator(in this example) =
             = tells what TouchDown is equal to
             Then print the variable out
  #In this example we added a double contains decimal numbers
  #You can also use float to store decimal points
  #Characters are single letters
     To define a character
        char is the character
        The variable name is Hello
        The value of character(in this example is a) is put in single quotes
        The reason for single quotes is Java does not think is variable name
  #String is a group of characters
    String starts with a capital letter
    String uses a double quote
   #Boolean Variable
        It has only two values, True or False
   #How to name variable appropriately
    1. You want to give your variable name a relevant name
    2. Variable names are case-sensitive in Java
    3. If you variable name are multiple words
          the first letter each new word is capitalized but not the first word
    4. You cannot have spaces in the variable name or hyphen
        IF you want a hyphen use underscore instead
When you write
  int Gabu; means that you are declaring a variable
  Gabu=5; means that you are initializing the variable
When you write
    int Gabu=5; means that you are declaring and initializing the variable






 */

public class TestingVariables {
    public static void main(String[]args){
        int touchDown;
        touchDown= 6;
        double Maria;
        Maria=2.567;
        float Gabu;
        Gabu=2.45f;
        char Hello;
        Hello='a';
        String Sentence;
        Sentence="This is a sentence";
        Boolean Mother;
        Mother= true;
        Boolean Father;
        Father= false;


       System.out.println(touchDown);
       System.out.println(Maria);
       System.out.println(Gabu);
       System.out.println(Hello);
       System.out.println(Sentence);
       System.out.println(Mother);
       System.out.println(Father);

    }

}
