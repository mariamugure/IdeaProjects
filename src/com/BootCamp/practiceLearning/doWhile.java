package com.BootCamp.practiceLearning;

/*
   Essentially a while and do-while loop do-while the same thing
   The only difference between while loop and a do-while loop where the conditional test is perfomed
        In a while loop the conditional test is performed before statements are handled
        In a do-while loop the conditional test is performed after the statements are handled
    In do-while loop
        We move the conditional statement to beyond the statements
        The conditional statement will be done at the end
        After declaring and initializing the variable
            The do keyword (no parenthesis)is added with open curly braces at the end
            The curly braces hold the System.out.println("This is a loop");
           bottomNumber++;
           After the curly brace the  conditional statement is added while(bottomNumber<topNumber) with semi colon at the end not curly braces
           This example gives the same answer as the while loop example whileLoop.java
For both a while and do while loop
    We declare the variables before any work is done
You may ask the question what happens if the conditional statement is false on the first run in dow-while
    That is a good question
        If that happens these statements, since the statement are executed before the conditional statement
        *You will get at least one line of output


 */
public class doWhile {
    public static void main(String[] args) {

        int topNumber = 15;
        int bottomNumber =1;

       do {
           System.out.println("This is a loop");
           bottomNumber++;
       }
       while(bottomNumber<topNumber);
    }
}
