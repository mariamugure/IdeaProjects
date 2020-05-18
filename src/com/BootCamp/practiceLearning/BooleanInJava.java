package com.BootCamp.practiceLearning;
/*
We will make a program where we pass three different door
We go through the first door then the second door then the third door
    Those door will be represented by if statements
 */
public class BooleanInJava {
    public static void main(String[] args) {
        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors=false;
        int doorCount = 0;


        if (passedDoor) {
            System.out.println("We have passed the first door");
            doorCount++;

        }
        if (passedDoor) {
            System.out.println("We have passed the second door");
            doorCount++;

        }
        if (passedDoor) {
            System.out.println("We have passed the third door");
            doorCount++;

        }
        if (doorCount == 3) {
            passedAllDoors=true;
        }
        if(passedAllDoors){
            System.out.println("Congratulations you won the program");
        }


    }
}
