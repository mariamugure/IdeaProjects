package com.BootCamp.practiceLearning;
/*
  The while has only one section to deal with
    This is the conditional test
    The while statement will test the condition at the beginning of the loop before any statements in the loop have been handled
        If it keeps testing out true the loop will keep going around and around
        Also if the testing condition never changes the loop will keep going around indefinitely
            You have to be careful, unless that is what you what
 */

public class whileLoop {
    public static void main(String[] args) {
        int topNumber=15;
        int bottomNumber=1;

        while (bottomNumber< topNumber) {
            System.out.println("This is a loop");
            //if print this statement it will go on indefinitely
            bottomNumber++;
            //adding bottomNumber++;
            //basically looped around each time and incremented the bottomNumber variable by one each time
            //when it hit 15, the condition was on longer true bottomNumber was equal to the topNumber
            //If the bottomNumber is > than topNumber the loop will not run even once
        }


    }
}
