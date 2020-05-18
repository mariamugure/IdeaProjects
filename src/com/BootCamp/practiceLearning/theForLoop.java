package com.BootCamp.practiceLearning;
/*
  A  loop is statement of a block of code that is repeated in program over and over
        You can specify a fixed number of times or you can run it indefinitely
  When you create a  for loop statement it will cause your program to keep returning to the sam place over and over
  In Java are three types of loop statements
    1. For loop
    2. Do loop
    3. While loop
   Looking at the for loop
        The for loop is the most complicated of the three loops
        if you get for loop down the other ones will be easier to understand
in the program
    type for then parenthesis
    There are three parts to for loop
      1. The initialization section
      2. The conditional section
      3. The change section
 Initization section
    You want to initialize a variable
    This is the starting point
    Here we declaring the starting point
 Conditional section
    Essentially tells us when to end the for loop
    how far it should go
  Change section
    Here were specifying what do each time the loop runs one time
    Example use ++ to increment each loop by 1 until conditional section is reached
    Example use +=2 increment each loop by 2 until conditional section is reached
    Example use +=4 increment each loop by 4 until conditional section is reached
    Example use +=10 increment each loop by 10 until conditional section is reached
 */
 public class theForLoop {
    public static void main(String[] args) {
        for (int start=0; start<=50;start+=10) {
            System.out.println(start);

        }
    }
}
