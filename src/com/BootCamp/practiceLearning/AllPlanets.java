package com.BootCamp.practiceLearning;
/*
Here we are learning abbut objects
    We created a class(object) called planet and we learn more about objects
    I want to point out something here so you are not confused
        Back in the template(planet) we do not have a main method
            The reason is (remember the planet object is just a blueprint template to create objects from) is will not be running this
              When you run planet class(object) is will not work because it does not have a main method
                because it does not need a main method and it is not the program
             The main method goes in this program
                Then we can go ahead and start creating objects now from our template
                    We are going to reference our object(PlanetObject
                    Then weill declare a new name of this object which will be  Earth
                     Here is the keyword that creates the new object
                        newPlanetObject9()
                      Since we have created an object we cn go ahead and set the variables and call the methods
                        Go ahead and use the object that we have created(Earth)
                        The put a dot next to the object(Earth.)
                        After the dot put the attribute that you created in template(size)
                        After the attribute put equal sign and put the value of attribute(size)
                        We have our attribute defined and we need to do something
                            We want to print this out
                            We want to use the method that we defined in the template
                                To do that we type in our new object. then set the method defined in the template
                                    We did not need to create the method over again, we just need to reference it
                                        Remember that the methods and the classes always stays the same
                                        We did not alter the class or change the method, the only thing that is different is the attribute
                                    You can then define other objects







 */
public class AllPlanets {
    public static void main(String[] args) {

        PlanetObject Earth= new PlanetObject();
        Earth.size=25000;
        Earth.displaySize();

        PlanetObject Jupiter= new PlanetObject();
        Jupiter.size=50000;
        Jupiter.displaySize();


    }
}
