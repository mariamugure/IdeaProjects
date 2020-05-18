package com.BootCamp.OtherPracticeexercises;
/*
    This question is attempting to see if you know whether strings are immutable or not
	String are immutable in Java
	An immutable class is simply a class whose instances cannot be modified
	All the information in an instance is initialized when the instance is created
	There are many advantages of immutable classes
In the example below
	How can we change the string so that we actually mutate it
	The easiest thing to do is to convert the string to char array using build it
	Now lets us figure out our algorithm
	The easiest thing to do is using pointers(int i and int J)
		Have one pointer for the left side of the string and the other point for th right side of the string
		    First pointer int i=0;
		        This the first half of the string
		    Second pointer=s.length-i
		          This is the second half of the string
		          We are doing minus 1 because arrays are zero based indexed
	The swap the characters in each pointer
	Then increment one pointer and decrement the other pointer
	Then once they meet, we will have reversed the string
 First pointer int i=0;
		        This the first half of the string
    Second pointer=s.length-i
		          This is the second half of the string
		          We are doing minus 1 because arrays are zero based indexed
    Make sure we could do this throughout the entire string
        We will have a while loop
            Where i< j
                Here will  reverse the character stored at the i index and the j index
                To do that we store a temporary variable which will hold the i character
                    Then will store the i character equal the j character then will set the j character to temporary variable
                    Then increment i and decrement j so we do not go in a infinite loop

 */

public class ReversingStringWithTemporaryVariable {
    public static void main(String[] args) {
    }
}








