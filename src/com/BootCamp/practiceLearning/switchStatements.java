package com.BootCamp.practiceLearning;

/*
We learned that if statements or if-else statements are good when you have two possible situations such as true or false
There will be instances where your testing multiple conditions
    You could use if-else statements to accomplish that but you would have to chain all to handle the different conditions, that is not the best practice
    The way to accomplish that is to use the switch statement
The switch statement uses something called the case statement
    The case statement are used to test the variable switch statement against specific value
    After each case study is a break
        A break if the case statement equals the variable then we can exit out of the program
        If the case statement does not match the variable it moves to the next case statement
What happens if none of the case statements mean the variable
    There should be a parameter called default
 */
public class switchStatements {
    public static void main(String[] args) {
        int fieldGoal;
        fieldGoal = 3;
        switch(fieldGoal){
            case 6:
                System.out.println("This is a Touchdown");
                break;
            case 2:
                System.out.println("This is a safety");
                break;
            case 3:
                 System.out.println("This is fieldgoal");
                 break;
            case 30000:
                System.out.println("This is an impossible score");
                break;
            default:
                System.out.println("Nothing matches ");
                break;
        }
    }
}