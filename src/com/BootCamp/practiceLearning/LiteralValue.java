package com.BootCamp.practiceLearning;
/*
    Today we are looking at methods in detail
        specifically we are going to look at the two main ways to pass a value
        One is to the literal Value
            The literal value is exactly that
            It us the actual number
            We are passing the value 45 into methodChildClass1
                placing the literal value into the System.out.println calling the methodClass1
            methodClass1 received the literal value and placed it into placeholder
                It goes to to the brackets first, this can be whatever I want to call it
                        It is a placeholder for the value that will be passed into method and do whatever work we want to do with that value
            Then literal value in the placeholder is passed to the method
                So that the method could execute it
            The method goes ahead and uses the this keyword, switching the x from local variable to class level variable (which is private int x;)
            class level variable+ placeholder
                 Class level variable calls LiterValue constructor to get the value of 50
                 50 is added to Literal value 45 in the placeholder producing 95
                 Method does a return of the value
                    It knows to return a int because we specified in the method that we wanted int
                Then work if the object is done
          Lets do another method call to methodChildClass
             System.out.println(testObj.methodChildClass())
                prints 15
            System.out.println(testObj.methodChildClass1(45));
                prints 60
            Now might be wondering how come I got 60 this time
               System.out.println(testObj.methodChildClass()) got executed first because it first in the list
                      It went up to methodChildClass
                      Set the value the variable to 15
                      Then returned a 15
                      Also private int X(object ) was set at 15
                        Keep in mind, in the constructor we had set that to 50
                        But the method  methodChildClass overrode what the constructor did
                            Remember the constructor comes first then methods second
                            So the method resets the value to 15
             Then methodchildClass1 gets invoked
                System.out.println(testObj.methodChildClass1(45));  gets executed
                We are passing the value 45 into methodChildClass1
                placing the literal value into the System.out.println calling the methodClass1
            methodClass1 received the literal value and placed it into placeholder
                It goes to to the brackets first, this can be whatever I want to call it
                        It is a placeholder for the value that will be passed into method and do whatever work we want to do with that value
            Then literal value in the placeholder is passed to the method
                So that the method could execute it
            The method goes ahead and uses the this keyword, switching the x from local variable to class level variable (which is private int x;)
            class level variable+ placeholder
                  The methodChildClass changed private int x; to 15 resetting the value in the constructor
                 now this.X is 15 that added to 45 in the placeholder producing 60
                 Remember the object variable can be consistently be changing as you go through your different methods
            Method does a return of the value
                    It knows to return a int because we specified in the method that we wanted int
                Then work if the object is done






         The other is pass by reference
            Where we are actually using the name here
            We are passing the value(5) goes through temp.play(toyNumber);
         There is no difference between the two  ways
            Both are sending values to the method that they are calling

 */
public class LiteralValue {
    private int x;
    public LiteralValue(){
        x=50;
    }
    public int methodChildClass(){
        x=15;
        return x;

    }
    public  int methodChildClass1(int placeholder){
        this.x=this.x+placeholder;
        return x;
    }

    public static void main(String[] args) {
        LiteralValue testObj=new LiteralValue();
        System.out.println(testObj.methodChildClass());
        System.out.println(testObj.methodChildClass1(45));

    }
}
