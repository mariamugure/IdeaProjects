package com.BootCamp.homework.questions;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

 */
public class Question8 {
    public static void main(String[] args) {
         String words="karan  madam tom civic  radar jimmy kayak john refer  billy  did";
        Scanner scanner=new Scanner(words);
        ArrayList<String> list = new ArrayList<String>();
        while(scanner.hasNext()){
            list.add(scanner.next());


    }
        System.out.println(list);


    }
}
