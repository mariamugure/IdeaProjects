package com.BootCamp.practiceLearning;
/*
 We want to invoke both the methods that we defined in Food.java
 lets start with the return method
    contains the System.out.println();
 then lets move to void method
    This is different since we were doing our print in the Food.java
    you can call systemPrint directly since  it is void
 */
public class HamburgerJoint {
    public static void main(String[] args) {
        Food servingA= new Food("Hamburger");
        System.out.println(servingA.getFood());
        servingA.systemPrint();

    }

}
