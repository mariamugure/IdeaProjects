package com.BootCamp.practiceLearning;
/*
  We will create our objects from the Addition.java
  Addition addObject= new Addition();
        This is the creation of object
   System.out.println("The Addition equals " +);
        After the + we will call the method that we created in the template
        We will take our object(addObject). then call the method in the template(getnumber)
        then run the program
            We go 30 because it hit the first constructor in the Addition.Java
        Now let us go back where you defined the object
            Addition addObject= new Addition();
            place your numbers in the parenthesis separated by commas
            This type it hit the second constructor because it realized that values we placed in the parenthesis
                The reason we gave the weird letters in the Addition.java because we did not want to give this a numeric value
                    Because you want to put any value
                    the letters are placeholders for the value
    Let us create another object
      add.Object1
    Now we can create as many objects as we want and put in different values
    Each one of the objects what we created is using own instance of Addition.Java
        More specifically they get to use their own instance the second type of constructor in Addition.java and thus get to use their own values






 */
public class AdditionProgram {
    public static void main(String[] args) {
        Addition addObject= new Addition(79,21);
        Addition addObject1= new Addition(100,21);
        Addition addObject2= new Addition(100,200,500);
        System.out.println("The Addition equals "+ addObject.getnumber());
        System.out.println("The Addition equals "+ addObject1.getnumber());
        System.out.println("The Addition equals "+ addObject2.getnumber());



    }
}
