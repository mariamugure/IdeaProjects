package com.BootCamp.practiceLearning;
/*
From the candy class(super class or template
    Here comes the key point to this whole lecture
        You may be asking, how do i tie the sub class (GumDrop) to the super class (Candy)
                You do that by extend statement
                This is where the GumDrop class becomes the child of parent class or the superclass(Candy)
                        In the program sub class(GumDrop) always comes first then super class comes after the extends parameter
                                GumDrop inherits everything from the Candy
                                That is what ties GumDrop to Candy
                                        put a comment this is a sub class
                               Now we need to declare(define) some attribute of GumDrop
                                        Specifically what some of the flavors of GumDrop
                                        So now we have our flavors declared(defined), we need to give this class some methods
                                                Assigning behaviors
                                                some will be void givemeCinnamon
                                                    let us have this method to the following behavior

                                                        System.out.println("This is a cinnamon"+ cinnamon+ "GumDrop)
                                                        System.out.println("This is a cinnamon"+ spearmint+ "GumDrop)
                                                    Now will create our program which is going to create some GumDrop objects from two classes that we declared(defined)





 */
public class GumDrop extends Candy{
    //This is a sub class

    String cinnamon= "cinnamon";
    String spearmint= "spearmint";
    void givemeCinnamon(){
        System.out.println("This is a cinnamon"+ " " + cinnamon + " " + "GumDrop");
            }
    void givemespearmint(){
        System.out.println("This is a spearmint"+ " "+  spearmint+ " " + "GumDrop");

    }
}
