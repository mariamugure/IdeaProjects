package com.BootCamp.practiceLearning;
/*
Learning from the Candy class and the GumDropClass
We will put a comment that this is the actual program
We will put in the main method here
Remember from the previous lectures
    The main method goes in the program
    We do not put in our classes
Now we can go ahead and create some GumDrop objects
    we create objects
        GumDrop Red= new GumDrop();
        GumDrop Green= new GumDrop();
     Let us go ahead and have these objects do some things
            let us do red.cinnamon
                We are pulling this method using this method we do not need to type out from the GumDrop class that we defined
                        let us go ahead abd give it a sugar amount
                            Red.SugarAmount
                            So lets and review
                                We created the Red object


 */
public class inheritanceProgram {
    public static void main(String[] args) {
        GumDrop Red= new GumDrop();
        GumDrop Green= new GumDrop();

        Red.givemeCinnamon();
        Red.SugarAmount=10;
        Red.displaySugarAmount();
        Green.givemespearmint();
        Green.SugarAmount=9;
        Green.displaySugarAmount();


    }
}

