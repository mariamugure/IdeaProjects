package com.BootCamp.practiceLearning;
/*
The other is pass by reference
            Where we are actually using the name here
            We are passing the value(5) goes through temp.play(toyNumber);
         There is no difference between the two ways
            Both are sending values to the method that they are calling
         In the example below
            Here were are not putting the value in
            We are doing a reference by value
            But I like I said this toyNumber is the value, even though we put the variable name
                It is the value that gets passed
             In the method the toyNumber in the brackets is a placeholder
                 we can actually call it placeholder
             The calling name does not have to match whats in the method been called


 */
public class Reference {
    void play(int toyNumber){
        System.out.println( "Toy number in play "+toyNumber);
    }

    public static void main(String[] args) {
        int toyNumber=5;
        Reference temp= new Reference();
        temp.play(toyNumber);
    }
}
