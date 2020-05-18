package com.BootCamp.practiceLearning;
/*
   An array is a way to keep track of a long list of things
   The example program is zombie killer weapon and they are Strings and zombies which are also strings
   If a close-range zombie is attacking what weapon do we use
        The shotgun
         System.out.println(backpack[0]);



 */

import org.w3c.dom.ls.LSOutput;

public class Array {
    public static void main(String[] args) {
        String backpack[]= {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies []={"close-range zombie", "mid-range zombie", "long-range zombie"};
        int numberZombiesHate[]={4,90,70,123,12,4, 561,1};
        System.out.println("Our backpack items");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("-------------------");

        System.out.println("These are the  zombies");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);


        System.out.println("-------------------");


        System.out.println(numberZombiesHate[6]);








    }

}
