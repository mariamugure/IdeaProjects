package com.BootCamp.homework.questions;

import java.util.Scanner;

/*
Write a program that calculates the simple interest on the principal, rate of interest and number of years provided by the user. Enter principal, rate and time through the console using the Scanner class.
Interest = Principal* Rate* Time

 */
public class Question17 {
    public static void main(String[] args) {




        System.out.println("Enter number of years here: ");
        Scanner scanner= new Scanner(System.in);
        int numberOfYears= scanner.nextInt();
        System.out.println("Enter number of years "+ numberOfYears);

        int principal=4000;
        int rate=5;
        int interest=principal*rate*numberOfYears;


        System.out.println("The interest paid in 10 years is " +interest);




    }
}
