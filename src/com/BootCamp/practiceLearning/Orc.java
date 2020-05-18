package com.BootCamp.practiceLearning;
/*
Today we are going to look at getters and setters
    These are very important in the world of Java
        Not just Java but pretty much any programming language
     What getters and setters do is they basically encapsulate your data
        Specifically you want to encapsulate your variables from the outside world
        Basically what that means is you will determine the values that people use to to set your variables with
            Think of it as invisible shield around a variable ( public int height;)
            Basically you are saying you will use this( public int height;) value and this value only and that is all I will you to use
        You might be asking I already know what the value I want for this( in the example)
            Imagine that you have hundreds of objects and hundreds of methods all over the place, and many of them are calling orc object (what are going to create)
                You might assume that some developers may not know the values that should be used with and if they use a bad value, you can start crashing other objects or crash the entire program
                    and that why it is important  to encapsulate your variables
                    So we encapsulate public int height variable
                        Now we have set the visibility option
                            Remember the public private protected and default
                        The variable is available to anybody
                        Anybody can come in here and change the variable directly
                            create orc object in MainMap.java called orc1
                            When you  orc. you can see the height variable from orc
                        Imagine the MainMap has all code
                            it fires up the world and in this world we are going to add orcs
                            We want th height of the orc to be less than 10 feet, it cannot be any greater
                                And the reason is lets us assume we have some caves in word and the roof of this cave let us say is 10 feet tall
                                        Well if this the case and we make an orc that is 20 feet tall then the orc cannot get into that cave and worse we might crash or bring the whole world
                                        So the orcs have to be shorter than 10 feet
                        You can call the orc directly and set the height
                            You can set it to whatever you wanted to
                        You can use the method that we set up
                            System.out.println(orc1.getHeight(9))
                            Then run the program
                        Later on a new programmer comes along and decides to add expansion pack expansion.java
                             He creates an expansion object
                             then decided to add oros too
                             so he is going create new expansion pack
                             Then creates his new orc
                             Then he decides to add a height of 15
                                    Assume that orc tried to go into one of the caves and everything come down because he passed a bad value
                                    Keep in mind, we didn't stop it the orc method
                                        It went through nothing stopped it from running
                                        But let us assume through fictitious code that his expansion map crashed
                                            ours was okay because our orcs were fine
                         So we go to Larry(the programmer) and inform him that he needs to put the orcs under 10 feet
                         Then you say I got to  lock some stuff down
                            You can variable in orc (public int height;) to private
                            Now larry cannot come and set the variable directly
                                He needs to go through the method
                                He cannot see the variable when he does orc2.
                         However, Larry can still go through the method
                            That is the main problem here,
                            He can still go ahead and set the variable
                         Here is where getters and setters come into play
                            So we could force Larry to go through some methods that enforce the fact that he has to have his orcs height lower than 10feet
                            So we to set two methods to accomplish that
                                We need a set and a get method
                                we already have the get
                                    We are going to actually pull some stuff out here because all this is going to return the height
                             First thing to do is to set another method
                                 public void (using void because we are not returning anything, all this method will do is set the height)
                                       The set method will the set the value
                                                The public void setHeight(){

                                                }
                                                We will pull this height=x from the getHeight method and it in set
                                                Then in the parenthesis in the setHeight method will place a placeholder called int Height
                                                Then will go MainMap.java and call the set method
                                        We are going to keep the getHeight method
                                                The getHeight will return the value
                                                Since your get method is just returning something
                                                    We do not need to pass something into the method
                                                        Because we now going to issue our call to the set method
                                                            The set method will set the value there
                                                        And the get method will return it
                                                        Then will go MainMap.java and call the get method
                                           When we run the method
                                             with our value(9) and 15(Larry) both run
                                             So Larry did not get stopped
                                             What we need is a if else condition statement in the set method
                                                The condition that will give range of feet that you can assign to the variable height of the orc
                                                if (height < 10) {
                                                 this.height = height;
                                                 System.out.println("Orc met criteria");
                                                 }
                                                  else {
                                                  System.out.println("Please enter a height under feet");

                                                       }
                                                    }
                                               Then run the program again
                                                    method under 9 feet run correctly
                                                    But the one over 10 feet
                                                        Produced a null value(0)
                                                        Why did return zero
                                                           We are doing the value assignment this.height=height
                                                                But since statements that over 10 feet only go through if (height<10)
                                                                    Since it false they do not go through assignment and continue to the else
                                                                When a variable gets initialized and there is no value to it initialized to  null or zero
                                                   Set (SetHeight) Method is like a gatekeeper
                                                       Everything has to come through the set method and it had to match and if does not match then you will be forced to correct and if do not correct it you are not going to have any orcs
                                                       The nice thing about this is people starting creating all these different maps ,all these different worlds and they decide to create orcs you never really worry about them passing bad values
                                                   What getters and setters do is they encapsulate our variables and prevent people from assigning bad values
                                                        It might protect you from you
                                                        You might this huge program and you might be adding some code years later, may be adding some new functionality years later and forget what the value that needed to assigned












 */
public class Orc {
    private int height;

    public void setHeight(int height) {
        if (height < 10) {
            this.height = height;
            System.out.println("Orc met criteria");
        }
        else {
            System.out.println("Please enter a height under feet");


        }
    }


        public int getHeight () {
            return height;
        }
    }

