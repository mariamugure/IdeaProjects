package com.BootCamp.OtherPracticeexercises;

import java.util.ArrayList;

public class PrintingNumbersUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
    }
        System.out.println(numbers);
}

}
