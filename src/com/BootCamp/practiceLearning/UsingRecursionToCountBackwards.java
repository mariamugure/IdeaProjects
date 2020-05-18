package com.BootCamp.practiceLearning;

public class UsingRecursionToCountBackwards {
    public static void main(String[] args) {
        CountBackwards(14);

    }
    public static void CountBackwards( int n){
        if(n==0){
            System.out.println("Done");
        }
        else {
            System.out.println(n);
            n--;
            CountBackwards(n);


        }
    }
}
