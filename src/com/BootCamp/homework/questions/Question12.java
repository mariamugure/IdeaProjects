package com.BootCamp.homework.questions;

import java.util.Arrays;
import java.util.Scanner;

/*
 Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers from the array. Use the enhanced FOR loop for printing out the numbers.
 */
public class Question12 {
    public static void main(String[] args) {
        int[] array= new int[100];
        for(int i=0;i<100;i++){
           array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
     }
}
