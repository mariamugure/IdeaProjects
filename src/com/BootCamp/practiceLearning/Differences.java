package com.BootCamp.practiceLearning;
/*
 We will talk about the differences between constructors and methods
 A constructor is a method
    But I might also ask you if a whale is a mammal
        Well it is but when i think of mammal i think of bear or a human or monkey ,something like that but not a whale
     The analogies can be applied to the differences between a constructor and method
 In the example
    if you go down at the bottom in public static void main(String[] args) {, the constructor will be invoked by the new keyword
    The constructor will get invoked and go up the Class differences and create a new copy(or instantiate this class) of the Class differences (object and in our example textObj)
        What the constructor does  is takes  Class Differences and makes a copy of it
        The class differences is loaded into something called Java Virtual Machine(JVM)
        There is a thing in the JVM called class loader
        The class loader  is what takes the copy(instance of the class/object) and loads it into memory so we can use it as an object
            There are things called the heap and the stack talk about them later
         Think of the constructor as the set-up guy
            He is king setting up everything up so that this testObj(object) could begin to do  whatever work we want it to do
          All of this happens in the beginning
          After the constructor is done with his work then the methods come in play
                So kind of think of the methods after the fact
                The constructor sets everything up and then the real fun starts with methods
                    Methods are going to do a majority of the work
            You many want to do some things  at start-up time when constructor is creating and instantiating  the classes Differences
                So you can put some code inside the constructor and give it somethings to do
                         That is somewhat similar to a method
                 The constructor creates the object and does somethings that you want to at startup
                        But basically when this the things inside the constructor are done it goes away then you will call you methods and your variables from the created object
                 Why do I want to put anything in the constructor
                         Why no use some methods to do the things in the constructor later on not in the beginning with the constructor
                      It all up to the programmer you do not have to put anything in the constructor
                           you can create another method for the things in the constructor
                      However there may be reason why you might want to some initial work when you instantiate the class and create your object
                            Let us think of a real-world example
                                Let us say that your are making a video game and you want to load up the first initial screen, may be the logging screen to your game
                                        Well you are going to go ahead and do that in the constructor
                                        And your methods could go ahead and work on the screen after  it been loaded
                                            That brings me to another point that I would like to make
                                                This screen that just talked about in our video game that just loaded, we cannot return anything to that screen so that is a key difference between constructors and  methods
                                                    Methods can return values but constructors cannot
                                                    The best way to think of that is fact that constructors are only involved  at start-up and the methods will handle return values later on
                                                    Also you cannot use void in constructors and well
      The signature
            The accessor(public, private, default and protected) and void(if included)
            If you notice you can use the public keyword in both the constructor and the method
                Those access modifiers like public, protected those all can  by both the constructors and methods
            But what we cannot do is use the second part of the signature(void) and a return value in signature of the constructor
                Also static cannot be used in a constructor


 */
public class Differences {
    String b= "Object/Instance variable B";
    String c= "Object/Instance variable C";

    public Differences (){
        String a= "Local Variable A";
        System.out.println(a+" Printed from Constructor Method");

    }
    public void printString(){
        System.out.println(b+" Printed from printString Method");

    }
    public String returnValue(){
        return c;
    }




    public static void main(String[] args) {
        Differences testObj = new Differences();
        System.out.println(testObj.returnValue());
        testObj.printString();

    }
}