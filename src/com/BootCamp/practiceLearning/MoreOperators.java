package com.BootCamp.practiceLearning;
/*
Incrementing and decrementing a variable
We use operators to increment and decrement a variable

++ increments by one


You can write it like
public class MoreOperators {
    public static void main(String[] args) {
        int score=10;
        ++score;

        System.out.println(score);

        OR like this

        public class MoreOperators {
    public static void main(String[] args) {
        int score=10;



        System.out.println(++score);


Putting the ++before the variable is called prefixing(the same for --)
Putting the ++ after the variable is called postfixing(the same for --)
 ++ after and before not in system.out.printLn gave the same answer
 ++after in the system.out.println gave different number
 A post fixed operator is used on a variable and value will not change until after the
 expression has been evaluated
 For it to be evaluated after the ++ then write the program like this
 public class MoreOperators {
    public static void main(String[] args) {
        int score=10;



        System.out.println(score++);
        System.out.println(score);


    }
}
 -- decrements by one


  The order for preference
    1. Incrementing(++)and Decrementing operators(--)
    2.  Multiplication and division
    3. Addition and subtraction
    4. Comparision
    5  = sign






 */
public class MoreOperators {
    public static void main(String[] args) {
        int score=10;




        System.out.println(score--);
        System.out.println(score);



    }
}
