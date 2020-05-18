package com.BootCamp.practiceLearning;
/*
#Strings are very critical to Java programs
They are Strings to communicate with users
Strings are basically collections of texts and characters
# what are a few ways that text can be stored in Strings
    1. Char
        for characters and  also numbers (0-9 only)
    2. Store a collection of characters using String
        You have to capitalize the S only string and use double quotes

System.out.print()
If you have a String with a quotation but backlash before the quotation and the end of the quotation
        System.out.println("Maria said,\"come home know\" ");
You can use \n to create new line
        System.out.println("Maria is coming home today.\nI am very happy");
you can add two strings together using the + operator
        System.out.println("Maria is coming today"+ "I am very happy");
After adding the string and you want a space you can add
        System.out.println("Maria is coming today"+" "+ "I am very happy");



String country="united states";
        String upperCase=country.toUpperCase();
         System.out.println(upperCase);
         #string name(country).(the dot call a predefined method
            The period calls a method
            The parenthesis after toUpperCase define it as method



 */
public class StringandSystemOutPrint {
    public static void main(String[] args) {
        char hello='h';
        char number='3';
        String sentence="This is a sentence you should read";
        String country="united states";
        String upperCase=country.toUpperCase();
        String home="BerniceMbugua";
        int index= home.indexOf("u");


        System.out.println(hello);
        System.out.println(number);
        System.out.println(sentence);
        System.out.println("Maria said,\"come home know\" ");
        System.out.println("Maria is coming home today.\nI am very happy");
        System.out.println("Maria is coming today"+" "+ "I am very happy");
        System.out.println(upperCase);
        System.out.println(index);

    }
}
