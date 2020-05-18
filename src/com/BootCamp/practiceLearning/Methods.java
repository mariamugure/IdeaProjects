package com.BootCamp.practiceLearning;
/*
     More on methods
        testTree.numberTrees(7); is called the calling method
            Also called argument
            calling methods always sends arguments to the receiving methods( void numberTrees (int trees))
            Some people will say I am passing a value
            Some people will say I am passing an argument
       void numberTrees (int trees)
         (int trees) is called parameter
         int trees is actually a local variable
         When put things in the parenthesis the method must receive something
      trees2
        we declared and assigned in the method and did not need to pass anything to the method
       void keyword
          The method does not return a value to calling method( testTree.numberTrees(7))
          it will do System.out.println(trees+tree2)
          when it gets to the method's curly brackets, it will exit
      return value(return x;)
        What a return value returns the value to the calling method(System.out.println(testTree.returnNumber(55));)

       testTree.numberTrees(7);
            When we pass the 7 to  void numberTrees(int trees)
                We do not actually change value(7)
                When it values gets passed in (int trees)
                There is a bit of magic that occurs before the value gets to receiving method
                What happens is Java makes a copy of the value then pass the copy to the receiving method
                    The original value is never affected
                    The copy gets passed into the receiving method and that is when we against the local variable's value

       System.out.println(testTree.returnNumber(55));
           The calling method
           It calls the receiving method
                int returnNumber (int x)
                This is will return a value(int) since it is not void
                The return value is returned back to the calling method







 */

public class Methods {
    void numberTrees (int trees){
        trees= trees+1;
        int tree2=4;
        System.out.println(trees+tree2);
    }
    int returnNumber (int x){
        x=x+1;
        return x;
    }

    public static void main(String[] args) {
        Methods testTree= new Methods();

        testTree.numberTrees(7);
        System.out.println(testTree.returnNumber(55));
    }
}
