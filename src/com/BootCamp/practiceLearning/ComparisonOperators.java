package com.BootCamp.practiceLearning;
/*
Comparision operators are used to compare two variables with all primitive data types
== means is equal to
    example
        a== b if equal will get true
        a==b if not equal will ger false
<= less than or equal to
< less than
>= greater than or equal to
> greater than
!= not equal to


You can compare two operators
    || or
    && and
 */
public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        double i = 2.4;
        double k = 2.5;

        boolean c = a == b;
        boolean d = a <= b;
        boolean e = a >= b;
        boolean f = a < b;
        boolean g = a > b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        if (a == b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }

        if (a != b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }

        if (a <= b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }

        if (a >= b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }


        if (a < b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }

        if (a > b) {
            System.out.println("I love programming");
        } else {
            System.out.println("I love programming Java");
        }


        if (i == 2.4 || i == 2.5) {
            System.out.println("This awesome");
        }

        if (i == 2.4 && i == 2.5) {
            System.out.println("This is not awesome");
        }

        if (i>0 && i<100) {
            System.out.println("This is very awesome");
        }
        if (i>=0 && i<=100) {
            System.out.println("This is very very awesome");
        }
    }
}
