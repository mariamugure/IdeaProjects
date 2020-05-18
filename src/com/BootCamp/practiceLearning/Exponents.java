package com.BootCamp.practiceLearning;
import java.lang.Math;
import java.math.BigInteger;

/*
   Exponents is one number raised to the other number
   You can do an int, float, long, double, byte, short
   Here will be explaining only int but works the same for all
   How you raise int a which is 5 to the second power and get 25
        You can do 5*5
        You Math.pow( for double
        if you want int
            (int)Math.pow()

 */
public class Exponents {
    public static void main(String[] args) {
        double a  =5.5;
        int b =5;

        System.out.println(Math.pow(a,2));
        System.out.println((int)Math.pow(b,2));




    }
}
