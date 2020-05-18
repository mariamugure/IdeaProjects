package com.BootCamp.practiceLearning;
/*
    Anything with rows and columns can stored as a 2d array
        It is like having a quick table ou access all time
    To make a 2D in Java
        First you think about what values it will have
        The example is a lottery ticket
            Contains integers
                Each row has curly braces
                Each column has curly braces
                You start with the rows
                We will do a 3(rows) and 3 columns
                    The first row {20,15,7}
                    The second row {8,7,19}
                    The third row {7,13,47}
         You can also set the array like this
             int [][] lotteryCard2= new int[3][3];

                    lotteryCard2[0][0]=20;
                    lotteryCard2[0][1]=15;
                    lotteryCard2[0][2]=7;
                    lotteryCard2[1][0]=8;
                    lotteryCard2[1][1]=7;
                    lotteryCard2[1][2]=19;
                    lotteryCard2[2][0]=7;
                    lotteryCard2[2][1]=13;
                    lotteryCard2[2][2]=47

                    [row] [column]
                if you want to print some of elements in the array
                        use a for loop
                        for( int i=0; i<3; i++){
                            System.out.println(lotteryCard[i][i]);
                       When you run it will print the diagonal numbers
                            20
                            7
                            47
                if you want to print all the elements in the array
                          use a nested for loop
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.println(lotteryCard2[i][j]);


 */

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] lotteryCard = {{20, 15, 7},
                {8, 7, 19},
                {7, 13, 47}
        };

        int[][] lotteryCard2 = new int[3][3];

        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][2] = 47;

        System.out.println(lotteryCard2[0][2]);
        System.out.println(lotteryCard2[1][1]);
        System.out.println(lotteryCard2[2][0]);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lotteryCard2[i][j]);

            }


        }
    }
}

