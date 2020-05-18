package com.BootCamp.practiceLearning;
/*
  We have been coding a bunch of lines and creating all these programs but what does that mean in the larger sense
  Wouldn't it mean sense to make programs with lines of code that we can use again and again if we need them
  The critical element to understanding and utilizing Java ot its fullest extent is OOP
    OOP is Object Oriented Programming
    When beginning programmers hear the term object or OOP, they naturally ask the question
        What does that relate to?
        What does it mean?
        Object will make life in Java so much easier
        This video will fundamentally change the way you think of your program, you think less of it as
           as series of lines of code and more a collection of objects
           objects that you use to accomplish tasks that you want your program to perform
        If I had to describe OOP in one word it would be reusability
            Reusing lined of codes for specific tasks that you can use over and over again
        Let us talk about a real world object because you know it is always good to compare things in real life
            Let us say that you can create planets
                1. Let us assume that you creating your first planet
                        so you go ahead and design your planet and ready to create your first planet
               2. You also decide that you want create more planets based off the template of the first planet
                        The first planet becomes the template for the rest of  the planets you produce
                        it is a blueprint that you can create other planets or objects templates
                        Think of classes in the same way you use classes to provide a blueprint for an object
         So basically an object is created from class
                We have been dealing with classes, so that is an new way to think class that we have defined earlier
                So after you create the initial object, the blueprint of the initial planet you can use it again and again, it reusable
                        You can create new objects from that original template but new object are considered copies or instances of the original blueprint
         Every object needs some characteristics
            Evert object has an attribute and a behavior
                    Example we might say our planet has an attribute so size  and behavior is(other characteristic and that involves doing something)
        Let us create an object
            We create objects by using the class as the template
            We first type in public class and name of the object(planet in this example) then squiggly brackets
                   Now might say wait a minute have not we been doing this already and
                        The answer is yes
                        We have seen these in the previous examples thus far
                            We have been doing OOP all along
                            Remember in the previous examples, I said that the public keyword makes it available other programs
                                    So that is how class is available to any program that want to use the planet object that we are declaring
                                        After creating this object called planet but we cannot really do  anything yet because it does not have attributes
                                                The attributes will give it life
                                                We add attributes to make the class useful
                                                In the program we will declare a String
                                                    Again you are going notice how similar this  is to the other programs that we have been doing
                                                    We are going to declare a String variable called size (this will be the size of the planet
                                                    Then are going ahead(remember we always declare a variable just the other programs what we have being working on and we also do that before the method) give it a method
                                                        public void displaySize in the curly brackets
                                                    Now we are going to do a System.Out.Println();
                                                        size of the planet is"+ size)
                                                                This looks like just a regular program that we have been using
                                                                We defined our object( the name is planet)
                                                                We gave the attribute of size to the planet
                                                                        Remember we use variables to give an object its attributes
                                                                 Every class needs a method(displaySize)
                                                                        That method will call System.Out.Println();
                                                                  Think about the object having two parts
                                                                        We declare the attribute with the String variable
                                                                        The second part is the method
                                                                            The method is part of the objects behavior it reveals the plants size
                                                                            I should point out that in terms of using objects you rarely change the class or method(s), its the attributes that you change
                                                                                That is what makes each object unique
                                                                                It we create other planets based off the planet template, they will have their own attributes
                                                                                  Let us say we want to now reuse this object planet that we have created in another program
                                                                                  Let's create a new program so we can go ahead and start creating some objects
                                                                    There are many other ways to use objects
                                                                            The big one is called inheritance


















 */

public class PlanetObject{
  int size;
  public void displaySize(){
        System.out.println(size);
    }

}
