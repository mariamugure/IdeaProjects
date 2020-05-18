package com.BootCamp.practiceLearning;
/*
    While loop starts with a while keyword then parenthesis then curly braces
    In the parenthesis we put
    A while loop repeats code forever until a trigger that you specify occurs
            Let us start with printing out the letter a
            in the parenthesis put true
            then run program
                The program will run forever until you stop it from running manually
    What we put in the parenthesis is just something that is true or false
        When true the code inside the curly braces will run
            The goes back to top of the code and runs it again
            It will doing this(after executing what is in the curly) it will go back to top and continue until we there is code to tell the computer to stop
        When false the code inside the curly braces will not run
            When false, intellij will tell you unreachable statement and will not run code
      Let us do a simple example with a counter
            We can have a counter int start at zero and we want to print while it is less that 10
            In the parenthesis, we put a<10
            We print  System.out.println("a is less than 10");
            then a++;
      While loops are used mostly for doing something until the end
        You may not know what the end is and that is why while loops are super important
        Copy the while code into for loop run, you will get the same thing
           Later I will explain when to use a while loop
       Do while loops
        start with the do keyword then curly braces then your while then parenthesis then semicolon
        You need to put a true or false expression in the parenthesis
        Inside the curly braces is where we would put our code
        Example
         Curly braces  will print the letter a
         Parenthesis will put a==1
         Then print
      The difference between a do while loop and a while loop
         The do while loop will always do what is in the curly braces first even though what is in the parenthesis is false
            In the example do{
            System.out.println("a");
                    }
                    while(a==0);
                        The program first prints a in do curly braces
                        Then goes into the while expression since it true it will keep printing a forever
                        when you put a==1 it will print a in the curly braces then while parenthesis expression false then it stops

         The while loop will never run when false
         Most of time you are going to be using while loops for repeating until the end of something
            Example you have sentence and you want all the words stored into an array and you can do that with while loops
                You can get the individual words by setting up the scanner the parenthesis will be sentence since we are getting the words from the sentence
                Now let us bring it to our program using ArrayList of type String
                Now to the while loop
                    While we have a next word grab it and throw it into the ArrayList
                    in the parenthesis we have Scanner.hasNExt
                            build in Java method that returns true if the scanner has another token it its input
                    Then we will put it in the words ArrayList
                        Type the name of ArrayList (words) then dot to bring the things that ArrayList can do
                                We will use add then inside the parenthesis add scan
                   Then we print the ArrayList





 */

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopsAndDoWhileLoops {
    public static void main(String[] args) {
        int a=0;
        String sentence="I love programming in Java";
        for(int i=0; i<10;i++){
            System.out.println("a is less than 10 " + i );


        }
        while(a<10){
            System.out.println("a is less than 10 " + a );
            a++;
        }

        do{
            System.out.println("a");
        }
        while(a==0);


        Scanner scanner= new Scanner(sentence);
        ArrayList<String> words=new ArrayList<String>();
        while (scanner.hasNext()){
            words.add(scanner.next());

        }
        System.out.println(words);
    }
}
