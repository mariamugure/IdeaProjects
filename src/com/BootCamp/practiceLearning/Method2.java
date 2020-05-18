package com.BootCamp.practiceLearning;
/*
  We are going to look at methods again
        Specifically we are look at something we have not done before
        We are actually going to declare an object inside a method that is not our main method
        Right up ot now we have been declaring oru objects all the way down at the bottom and declaring them in the main method
        You do not need to declare objects in the main method
            You can declare them anywhere you want
        Today we are going to declare objects inside the method in Method2.java that is not part of the main method
                That brings another point in terms of how you want your program to operate
                        One way to do it is the way we having been doing it
                                We declare a bunch of object in the main method and running down the list in the main method
                 The other way is to declare your objects outside of the main method and having your objects talking to your objects in all your other classes then you have only one object in the main method that will kick everything off
                        You also have a hybrid of some objects in the main method and objects outside the main method
                        It is really how you want to do it
                        I will tell you that a lot of times
                            Let us say you develop the Method2.java class and test it really quick
                                    You an go ahead and just drop a main method in and test to see if works
                                    That may not be where you main ends up, the class may be part of an overall hierarchy, but you just want test the class
           We declare a new object in Main1. java that contains the main method
                    The method will be call is callIt
                            It isa void method
                      In callIt method
                            We are actually going to declare a new object called testObj
                            Kind in mind we have this object exists only inside the callIt method
                            The object does not do anything outside the method
                            The purpose of creating the object is to call the doIt method and pass two values(13,14 back to doIt method)
                            So in Main.java
                                We already created the object (testTree)
                                We go ahead and invoke the method
                                        testTree.callIt(); and run (get 182)
                                So what we did was we got two methods (callIt and doIt) and copied them
                                        Here we are passing by reference
                                        We get the same result when we run (182)









 */
public class Method2 {
    void callIt (){
        Method2 newObj =new Method2();
        newObj.doIt(13,14);

    }
    void doIt (int a, int b){
        int multiply =a * b;
        System.out.println("Number we get is " + multiply);
    }
    void callItAgain (){
        Method2 newobj= new Method2();
        int xx=13;
        int bb= 14;
        newobj.doItAgain(xx,bb);

    }
    void doItAgain (int a , int b){
        int multiply =a * b;
        System.out.println("Number we get is " + multiply);
    }

}
