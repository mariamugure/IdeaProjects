package com.BootCamp.practiceLearning;
/*
Check the image OneNote under Java the complete reference(check the page to inheritance classes objects )
Before we talked about classes and objects(above diagram in the image), here we will add another thing called inheritance
Looking at the image
    We created a class called planet then we created objects from template the planet
        Classes are reusable code
        You do not need to type it over and over again if you want to reuse it
        Create objects by using shortcuts to the methods and variables in that class
 Inheritance comes play when you start adding multiple classes
    And what these multiple classes have, is they share a set of common characteristics
    If you look at the image(below diagram)
        This is more realistic scenario
           Candy has sugar so is gumdrop
           The candy class is called the superclass or parent class
                Because it is on top of all the rest of the classes that are below it
           All the classes that we create below it are called the subclass or the child class then we can get to our objects
            As you see we are adding another layer of complexity
                But is not really that complex if think of it as  inheritance hierarchy
                Now in terms of the hierarchy
                    I also want to put out that your top class or the superclass is always a generic class and the lower you go they get more and more specific
                        Candy is generic and gumdrop are more specific
                    They also share common characteristics
                        Example they share sugar as common characteristic
                        You would not create a class called train and then create a class called gumdrop
                            They do not share any common characteristics
            Here will be creating a set of methods and variables that the gumdrop class will inherit from the candy class
                    This is won't have to type them over and over again
                    The objects will be created by gumdrop we won't have to re-type out the variables from gumdrops or candy
                        That is the power of hierarchies
               In program
                We will start with our superclass that we will be inheriting from
                    In the example
                        We make the super class Candy
                            Also a add a comment to call the super class candy
                            Remember in the previous example, evert class should have an attribute and a behavior
                            The attribute is the essentially the variable
                                In the example, let us give and attribute  of sugar(int)
                                    Remember in the diagram we said that candy and gumdrop share a common characteristic in sugar
                                In the example we will give this class(Candy) a behavior or method
                                    We will call the method in the example displaySugarAmount
                                            We will tell what the method( what the behavior is going to do) is going to do
                                            In the example, we will do a System.our.println("sugar amount is" +SugarAmount)
                                            the + what every we declared and will be used later
                                            In our last lecture, we said that our class template do not have a main method
                                                This is reusable code that is not a program
                                                        We will do that when we create our program to create our objects from the class template
 */
 public class Candy {
//this is the super class
    int SugarAmount;
    public void displaySugarAmount(){
        System.out.println("Sugar amount is "+"" + SugarAmount);
    }
}
