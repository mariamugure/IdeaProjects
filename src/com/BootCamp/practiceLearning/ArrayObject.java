package com.BootCamp.practiceLearning;
/*


We introduced Arrays before, but that was before we were introduced to objects
	I like to add a few more details about arrays in the lecture
We are not going to do any code here,a few lectures we are going a sample app and we be using arrays

Arrays are great way to organize an efficient list of things, they also give you fast access to by letting you use an index position to get to any element inside the array

Remember that every single element that is inside an array is just a variable
	But what those variables are can be very different
Arrays with primitive variables
	int [] intArray;
        intArray=new int[5];

        intArray[0]=41;
        intArray[1]=111;
        intArray[2]=114;
        intArray[3]=221;
        intArray[5]=226;

        This is array that holds primitive variables
        Remember that primitive variables hold absolute values
Arrays with object variables
        Orc [] monsters;
        monster=new orc[5];

        monsters[0]=new orc;
        monsters[1]=new orc;
        monsters[2]=new orc;
        monsters[3]=new orc;
        monsters[4]=new orc,

        This is an array that holds objects
        You can see the difference here in the elements
        Here we are actually declaring a new orc
        But arrays do the same thing, they hold something
        You think of arrays as line of boxes on the shelf
        	Each of the boxes hold something
                For instance box 1 in primitive example will hold primitive value of 41, box 2 holds primitive value 111, box 3 holds primitive value 114, box 4 holds primitive value 221 and box 5 holds primitive value 226
                For instance box 1 object variables example will hold object(orc), so on.
                The key point here to both of these arrays is every array is an object, no matter what it holds
                        Even if it is an array of primitives, the array as a whole is treated as object
                        The same thing for the object variable array
                                This object array that we called  monsters is also an object
                                It just what is contained inside arrays that is different
                                Remember arrays are always at the highest level objects, no matter what you have inside the array
          The Array with primitive variable is never considered primitive array again, because it is an object that holds primitive variables but we will never call the array itself at the high level a primitive array

          To make an array first we declare the array variable
                    int [] int array;
                    orc[] monsters;
           Then we create a new array and assign in the previously declared variable
                    intArray[]=new int[5];
                    monsters= new Orc[5];
            Then we can go ahead and either create objects or variables that hold primitive values
            Later on we can call them when we need them

 */

public class ArrayObject {
}
