package com.BootCamp.OtherPracticeexercises;

import java.util.Arrays;
import java.util.Scanner;

public class UsingForLoopsToPutNumbersInArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;

        }
        System.out.println(Arrays.toString(array));


    }
}
