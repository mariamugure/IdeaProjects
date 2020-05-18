package com.BootCamp.Package2;
import com.BootCamp.Package1.ClassTemplate;
/*
f you go to program B and decide to go ahead give the another variable( remember to check notes from ClassTemplate.java)
when you add the variable.
    You can only week  since it public(everyone can see public)
    You cannot  see day default(you can see default in the same package)
    You cannot  see month protected(protected can be seen since they are the same package)
    You cannot see year since it is private
 */

public class programB {
    public static void main(String[] args) {
        ClassTemplate newObject2= new ClassTemplate();
        System.out.println(newObject2.printWeek());

    }

}
