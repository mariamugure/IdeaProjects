package com.BootCamp.practiceLearning;
/*
static variables
  	username has a static variable in the example
        static variables are just that, they are static they never go away
		Think of them as like a cliff against the raging sea, they do not go away
		it is always there no matter what
		it is like a rock
		They stay around for the lifetime of the program
		        It is useful to talk about the JVM here
		          JVM is the Java Virtual Machine
		          Here we are talking about JVM in broader sense to understand how static work
		                because JVM does all the memory allocation for you
		                in languages such as c and C++, you have to do a lot of memory management
		           It is not necessary to understand memory allocation in Java
		                However it necessary for a little discussion about here because it will assist us in understanding how the static keyword works
		           What happens we save and compile our class
		                The class goes into te Java Virtual Machine
		                    Inside the JVM, there is something called the class loader
		                    The class loader takes class and gets a hold of it and allocates for use whenever we call for it
		                    The class loader also does something else
		                        The class loader does in the class and start scanning for the keyword static
		                        When the class loader finds static, the class loader finds the match
		                            We will then load the static variable into the runtime memory
		                                We using runtime memory in the broadest sense here
		                            so that static variable is good to go
		                            The same happens in static method
		                                The class loader will see it permanent and since there is no copies of this, we are not making instances of the method(making object and instances




		object or instance variables do go away with the lifetime of the object
		        I like to think of objects as on-demand, we need some work to done the object is created and use the variable and the object is done all goes away
		 Let us look the class Registration
		    The registration class is going to handle new users that come in our hypothetical website
		    When come in the website
		        Our constructor will go ahead the assign the username they enter to the public string usernameA variable then method putusernameDatabase will return the usernameA
		                At the point the object is done its work
		  you can also increment the usernameCount from the objects instead of the Registration.java
		  You can also reset the static variable

static method
	getfoodCount is a static method in the example
 */
public class Registration {
    public String usernameA; //object or instance variable
    public static int usernameCount=0;   //static variable

    public Registration(String A){
        usernameA=A;
        usernameCount++;

    }
    public String putUsernameDatabase(){
        return usernameA;              //return method
    }
    public static int getusernameCount(){
        return usernameCount;            //static method


    }
}
