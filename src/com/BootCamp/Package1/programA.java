package com.BootCamp.Package1;
/*

If you go to program A and decide to go ahead give the another variable( remember to check notes from ClassTemplate.java)
when you add the variable.
    Then you see all the variables from classTemplate(day,month, week) except year(the private)
    You can see day default(you can see default in the same package)
    You can see week since it public(everyone can see public)
    You can month protected(protected can be seen since they are the same package)
 */
public class programA {
    public static void main(String[] args) {
        ClassTemplate newObject= new ClassTemplate();

        System.out.println(newObject.printWeek());
    }
}

