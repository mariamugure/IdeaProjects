package com.BootCamp.practiceLearning;
/*
     Today we are going to look at the area of memory known as the heap
     The full name is the garbage collectible heap
            But we just going to call the heap
     Now every you create an object, it always put in the heap
            If you create a hundred instances of your class, they will all end up in the heap where they will do whatever work is required of them
     The good thing is Java manages all that memory allocation for you
            You do not have to do an thing
             But you need to have a working understanding  of how the garbage collector works
                    Eventually we will get into processes and it is critical to know how the heap works
                    And also in terms of the life and death of the objects on the heap
                        Death of an object is when an object is no longer being used it is purged from the heap
                        That frees up space so that is can be reused by later objects
      so let us take a look at this class
            We created a class called Garbage.java
            Let us create our first object from the Garbage.java
                Keep in mind since we have not created any objects yet, there is nothing on the heap and the heap is empty
            The new object will create is called obj1
                The garbage object is know created on the heap
             Let us also create another object called obj2
                  Now the heap has two garbage objects
                  Remember we talked about object reference variables
                       Remember we said that the obj1 in   Garbage obj1=new Garbage () is the object reference variable and then obj1 refers the object on the heap
                            obj1 refers to the memory of where object is located
             What we can say in Garbage.java is we have two active references(object reference object obj1 that refers to one of the Garbage object on the heap and object reference obj2 that refers to the other Garbage object in the heap
                    So we have two active references that are pointing to objects on the heap memory
             We also say we have two reachable objects
                    Both are reachable because both are being references
             What happens when we change some values
                    Let us assign the value of obj2 to obj1
                    Now what has happened is second object in the heap is no longer been referenced by object reference variable obj2
                            Both the two object reference variable(obj1 and obj2) are referencing one object in the heap
                                    We have teo active references
                                    but we have one reachable object
                                    one abandoned object
                                            Since the abandoned object is now longer references, the object is a target for deletion







 */

public class Gargabe {
    private int x=1;

    public void setNumber(){
        this.x=this.x+2;
    }
    public int getNumber (){
        return x;
    }

    public static void main(String[] args) {

        Gargabe obj1= new Gargabe();
        Gargabe obj2= new Gargabe();
        obj1=obj2;


    }

    }
