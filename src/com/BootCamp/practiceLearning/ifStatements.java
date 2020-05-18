package com.BootCamp.practiceLearning;
/*
#Your computer program can have 100 of codes
There are going to be many times when you do not want to step through every line
of that code, it does not make any sense
#You will need to be selective about what code needs to be executed
    In order to achieve that you can use conditionals
    In terms of the program, you want to think about if statements
    You are giving a computer a decision to make
        It could be a or b
            If it a it will execute this block of code
            if it b will execute another block of code
You write the if statement like this
    if()
    in the parenthesis is where all the action takes place
    The condition goes in the parenthesis
        A condition is just a test
        You want test if this true
In the example below uses ==
    == operand is not saying that touchDown is equal to 6
    but just testing to see whether touchDown is equal to 6
    and if it equal to 6 then we will go ahead and do something
    If not equal to 6 then we will do something else
        use the else statement is the condition is not true
 != tests not equal condition
 You can also use Less than(<) , greater than(>), less than or equal to(<=) or greater than or equal to(>=)
 If-else statements or if statements are good when you have two possible conditions such as a true or false situation
 */





public class ifStatements {
    public static void main(String[] args) {
        int touchDown = 6;
        if (touchDown<=3) {
            System.out.println("A touchdown was scored");
        }
            else{
            System.out.println("A Touchdown was not scored");
        }
        }
    }


