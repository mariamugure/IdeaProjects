package com.BootCamp.practiceLearning;
/*
     Recursion is just a method being called inside of this self
     We will do a really basic easy example of recursion
     Let us make a method
        The main method is a good template to make a method
        We will do public static void sayHi(){}
            We will print Hi
            it will not take any parameters
            Inside the curly braces iw what our sayHi method is going to do
            We will just print Hi
            Nothing gets printed on the screen because when we hit the green run button that only calls things inside of the main method
                We have to  call hi inside of main method
                    put sayHi(); inside the main method
            lets us  use recursion, we know that recursion is a method that call itself
                We will call sayHi inside the method sayHi and see what happens
                    The program printed a bunch of Hi and the top and bunch of  errors after the Hi
                        The error is exception in thread "main" java.lang.StackOverflowError
                        An exception means something stopped the flow of the program
                        It is because we are printing Hi so much that the computer cannot handle it
                        We recursion you are supposed to have the call of the method inside of it
                        What did we do wrong
                            The only other rule for recursion is that it needs to know when to stop
                                That is called a base case
                                So it does not do it forever infinitely fast and infinitely many
                        Let us try and fix the the method
                            You can make it stop by telling it how many times to want it say Hi
                                We can input that as parameter
                                    You can have int n
                                    (n) is the number of times we want to say Hi
                                    Put 5 in the method call in the main
                                        sayHi(5)
                                    Then remove the System.out.println("Hi"); and sayHi(); sayHi method
                                    A lot of the times in recursion to create a base by creating a if statement
                                         if(n == 0){
                                           System.out.println("Done!");
                                               }
                                               else{
                                                   System.out.println("Hi");
                                     But we know that for recursion you need call the method inside of itself
                                        in else call the method sayHi(); and pass in n
                                        When we run we still get the say error exception like before
                                            We have the base case why are we still getting the same error
                                                It is because n is never changing
                                                It never hits n is equal to zero, so we need to decrement each time
                                                    So eventually it will get down to the base case it will print done
                                                    when you run it will print Hi five times and then prints done
                                                    Now it is fully working recursion example
                                                        We have a method being called inside of itself and have a base case to tell it when to stop
                                     Let us explain what is happening
                                         When we click the green run button
                                                We go inside of the main method
                                                The first code we see is sayHi(5); with the parameter of 5
                                                Then five is passed to the sayHi() method then sets n to five
                                                Then n is not zero then we continue with the code in the else
                                                Then we print our Hi
                                                Then we decrement n by 1
                                                Now n is four
                                                Then we call sayHi(n) with four
                                                    The sayHi(n) in the sayHi() method is the sayHi(5) in the main method
                                                        They both go to the same code
                                                However, the sayHi(n) is now passing a four
                                                 The same continues as before
                                                    Then four is passed to the sayHi() method then sets n to four
                                                    Then n is not zero then we continue with the code in the else
                                                    Then we print our Hi
                                                    Then we decrement n by 1
                                                    Now n is three
                                                 However, the sayHi(n) is now passing a three
                                                    The same continues as before
                                                    Then three is passed to the sayHi() method then sets n to three
                                                    Then n is not zero then we continue with the code in the else
                                                    Then we print our Hi
                                                    Then we decrement n by 1
                                                    Now n is two
                                                 However, the sayHi(n) is now passing a two
                                                    The same continues as before
                                                    Then two is passed to the sayHi() method then sets n to two
                                                    Then n is not zero then we continue with the code in the else
                                                    Then we print our Hi
                                                    Then we decrement n by 1
                                                    Now n is one
                                                 However, the sayHi(n) is now passing a one
                                                    The same continues as before
                                                    Then one is passed to the sayHi() method then sets n to one
                                                    Then n is not zero then we continue with the code in the else
                                                    Then we print our Hi
                                                    Then we decrement n by 1
                                                    Now n is zero
                                                  However, the sayHi(n) is now passing a zero
                                                    Then zero is passed to the sayHi() method then sets n to zero
                                                    Since n is equal to zero the print done















 */

public class Recursion{
    public static void main(String[] args) {
        sayHi(5);

    }

    public  static void sayHi( int n){
       if(n == 0){
           System.out.println("Done!");
       }
       else{
           System.out.println("Hi");
           n--;
           sayHi(n);
       }


    }

    }

