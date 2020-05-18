package com.BootCamp.practiceLearning;
/*
Review session

      Today we are going to have a review session of many the concepts we have covered
      There will be some new material was well
      At the end of this I will also give some advice
      Of course we have been talking about establishing inheritance hierarchies when we design our class structure
            Why do we use inheritance
                    Because we have determined that some of our classes have certain behaviors and characteristics and attributes in common
             Dog Super Class
                food instance variable
                move()
                Eat()
             Beagle Subclass
                move()
                    Beagle Specific Code
                Eat()
                    Beagle Specific Code

             German Shepard Subclass
                move()
                    German Shepard Specific Code
                Eat()
                    German Shepard Specific Code
             If we look at the Dog Superclass, we determine that beagles and german shepard both have a common behavior they both move and both eat
                    So we can go ahead connect these classes together in a relationship called inheritance
                    Remember inheritance is not just about reusing code it is about establishing relationships and behaviors between the the various classes or common characteristics
                        So the subclass beagle and german shepard inherit from the superclass dog
                            Therefore, we inherit all of the dogs methods and we can use all the functionality of th god superclass
                            Remember we said that superclass are less specific and subclass are more specific
                                  We look at the move method in superclass that will be less specific than the beagle subclass move method
                                        This is because the beagle and the german shepard can move differently
                                        They may also eat differently as well
                                        That is why we have to code that is specific for the beagle and german shepard for move and eat
                                            That is what is means when we extend the behavior of a method
                 When we inherit methods from the superclass we are overriding the superclass method
                        That is this is now a different method
                        The only thing we are reusing is the name of the method, the arguments and the return  type
                                But the specific code inside of it something new and different from the superclass
                   Remember we can always add more methods and instance variables that are unique only to the superclass
                        Example
                            German Shepard Subclass
                                sharp teeth instance variable
                                move()
                                    German Shepard Specific Code
                                Eat()
                                    German Shepard Specific Code
                                guard()









 */

public class ReviewSession {
}
