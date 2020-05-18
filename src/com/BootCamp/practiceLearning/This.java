package com.BootCamp.practiceLearning;
/*
The This keyword has about 10 or 11 different ways to use it
But in this example we are going to use constructors because that is probably the most common way to use This keyword
So in the example
    We set up our constructor and will pass the value 79 into the instance variable
    new invoked the new keyword and it it went to construct an object of This class
    The us follow the lifetime of this
        The value starts at 79(one=X) then the number 79 is passed into the constructor(public This (int x) then it gets signed to the variable into the instance variable(private int=one;)
                Keep in mind that one=X; the X is a placeholder for the value
                    You will notice that it not numerical because it a placeholder
                    The only object is to pass it to the constructor(public This (int X)
                            Also the (int X) the X is also a placeholder
                            The placeholder has to match both places
                                Java recognizes that both are place holders
                             But if we put a number in one=X;
                                it wil cancel the 79 and count the number(example 12)
           the developer(me) comes along later on and decides that they are confused
                    if you have 15 different values in the parenthesis( public This (int X))
                            You are having a difficult time matching all things up
                            You change  (public This (int X) the X to one
                            Also you change (one=X) to one as well
                                however the answer changes from 79 to 0
                            When you look back at the code and examine what happened
                                First put System.out.println in the constructor to print the variable
                                      System.out.println is your best friend in the whole java because if you do not know what is value of something is you can print out to find out
                                      After printing one=one; instance variable you get 79
                                            Wait a minute it was supposed to pass it to the instance variable (private int one;)
                                            How come that did not happen
                                                You take the 79 from the  This testThis=new This(79) then pass it to the constructor where one=one
                                                    Think about for a minute one=one
                                                    Remember I told your the one after the equal sign is a place holder for the value
                                                            But we said that one =one
                                                            one equals itself and I am excepting Java to go ahead and pass that along
                                                                Well in this world when I say something equals something then it should not equal something else
                                                                In the program it only doing what I told it to do
                                                                But if I want to go back to instance variable we have to use the this keyword on the one before the equals sign
                                                                What we are doing here is we are basically saying Java know the one=one did here that is not really the case, so do not assign the value in here and stop your work pass it one to public this (int one) then assign it to the instance variable (private int one;
                                                                    This actually means instance
                                                                    What it means it means the instance of something
                                                                        of course this private int one; is a instance variable





 */

public class This {
    private int one;           // object or instance variable
    public This (int one){
        this.one=one;               //Local variable

    }

    public static void main(String[] args) {
        This testThis=new This(79);
        System.out.println(testThis.one);
    }

}
