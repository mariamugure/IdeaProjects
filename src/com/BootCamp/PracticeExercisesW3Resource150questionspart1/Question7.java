package com.BootCamp.PracticeExercisesW3Resource150questionspart1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Input a number: ");
        int number= scanner.nextInt();
        System.out.println("Input an number "+ number);



        for(int i=1; i<=10;i++){
            System.out.println(number*i);

        }
    }
}
