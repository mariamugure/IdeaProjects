package com.BootCamp.practiceLearning;
/*
If we type in the name of the Registration.java
    look you notice we get the static variable username and our static methods because those two are loaded up in the runtime
        We can technically start using them right now
        That is the same as the main that we have always been using
            The main is loaded in the runtime also
      The reason we use the class name is because we have not created an object
            Even we did create an object, we cannot use an object to reference a static variable
                It not even part of the object
            That is why we use the class name to refer to the static variable
  Looking the program
    I want you to pretend that nothing is typed in the program except public static void main(String[] args)
        let make assumption that when somebody comes into hypothetical website and they submit the form that has username
                We have additional code that will actually begin to generate the code to kick off this object
                    We create the new keyword then kick off our constructor to get Registration to do what it needs to do
                Our website goes live and five days later,
                     We get our first user named Mary
                     Mary comes into the website fills out all of our information, hits the submit button and then on the back end our Registration class  takes the name and is going ahead and plug that into a database
                            We have our object created(newuser1) then everything starts with the new keyword that invokes our constructor Registration and takes Mary's username which happens to be Mary the it goes to putUsernameDatabase method then tells class loader I need a copy of Registration to do some work
                                    Also they going to take the value of Mary assign it to String variable from the constructor
                                    And also at the same time increment  our static by 1
                                        Notice we started at zero and when Mary sign in it becomes 1
                  Now I am done and everything is over and you can now go the Main Class
                      After constructor is done we are going to ahead and invoke our putUsernameDatabase
                            The username of Mary is returned by the method
                            The method goes ahead and plugs it into our database
                            This method is done its work
                                The objects life is done as we know it and goes through a process called garbage collection by java that tosses like a piece of trash
                                      Is not a great name garbage collection, get it out of here right we do not want it anymore game over for that object
                                      Then main goes back to this little normal life just sitting here in the runtime waiting for something else to happen
                    Mary goes out to lunch with Larry and tells Larry about this great website that hse just joined
                        The larry goes back to the office and 1 hour later, he logs in and created his username Larry
                                Our new object is created(newuser2) and new keyword which invokes our constructor and takes the username Larry
                                        The takes the new value for the username(Larry) and the new username variable from public String usernameA; from Registration.java
                                The username Larry gets assigned to him and the constructor says increment the static variable
                                        Now the static variable has been there all this time
                                        Static variable has not changed and the value does not reset
                                             The public String usernameA; keeps changing but the static int username; does not change
                                              now the username count is 1 because Mary joined and will change to 2 when Larry  has joined
                      The next day mike my boss walks in goes you know we have been monitoring our network with all our websites and we have noticed that the website that you did backend Java for is getting some traffic, I need you to run a report and tell me how many people are registering
                            I go ahead my internal website and run a report and eventually through all these classes and other stuff it invokes getusernameCount(); static method
                            The method will return the value of the static variable usernamecount which is now 2
                       Two years later, apparently we had a bad marketing plan because everything south and we have not had a user in 2 years
                            So this poor little main and these poor little static variables are just sitting ut here waiting nothing
                            well, finally someone logs in our new revised marketing plan has worked
                            You get a new object(newuser3) and constructor(registration ()) gets invoked and input in the class loader that they need a  new object the so on
                            then new report and now the is 3 people
                      static methods  and static variables  go together liked peas in a pod
                        You should have static methods going after static variables
                        The reason is
                            Let us say I totally lost all sense of my wisdom here and decided to try and return  usernameA with instance variable to the static method (getusernameCount)
                                The program tells you that non-static field usernameA cannot be references from a  static context
                                    Basically what is going is go back to our timeline
                                        newuser 1 that we created ti put Mary in the database is no longer there, it is gone
                                            Now I am going to kick off a static method to call something that is not there
                                            That is why your static method go after the static variable because they will both always be there

                       		  You can also increment the usernameCount from the objects instead of the Registration.java
                       		      You may hear people say that objects all share the static variable
                       		         That is a true in a way
                       		        The Registration.java class is loaded by the class loader
                       		            The class loader then looks for static keywords amd loads each one out into the memory
                       		            What happens specifically is the class loader makes a copy(one-time copy) and copies it out into shared memory(runtime memory)and the copy sits there for good
                       		                    Then when we request objects to be made from our Registration.java those all go into another type of memory
                       		            But basically since that static variable is just sitting out there and shared memory, each object that gets created down line can see the static  variable
                       		                Then can also alter the value of static variable
                       		                The class can also see it as well
                       		                The objects can reference the static variable
                       		                        newuser.   (you should see the static variable)
                       		                            However you do not
                       		                            We are actually going to have to hard code the static variable
                       		                The class also which is loaded   and can see the static variable
                       		                    That means we can alter the static variable from the objects
                       		                        newuser1.usernameCount++;
                                                     System.out.println(newuser1.usernameCount);
                                                 newusername will increment our static variable
                                                    The program will tell you  that the static member accessed through instance reference
                                                    Remember before we were incrementing the usernameCount in the constructor, now what we are doing is we are waiting until the object is created and then we are going to increment it
                                                            it us essentially doing the same thing in a different way
                                                            The only difference is that is a real pain to to type each time(new way) instead of using the constructor(the previous)
                                                  You can also reset the static variable
                                                    Remember even the static variable is out there
                                                            The state does not change and what do I mean by state is that the memory allocated
                                                                        The static variable just sits out there and that does not really change
                                                                            but state always changes  on objects and they come and go because the memory gets allocated and then it  is deleted by the garbage collector
                                                              We will go ahead and reset the static  variable


                                                               Registration newuser4= new Registration("Brian");
                                                                newuser4.usernameCount++;
                                                                System.out.println(newuser4.usernameCount);


                                                                Registration newuser5= new Registration("Jade");
                                                                newuser5.usernameCount++;
                                                                System.out.println(newuser5.usernameCount);


                                                                Registration newuser6= new Registration("Gabe");
                                                                newuser6.usernameCount=0;
                                                                System.out.println(newuser6.usernameCount);


                                                                Registration newuser7= new Registration("Maria");
                                                                newuser7.usernameCount++;
                                                                System.out.println(newuser7.usernameCount);

                                                          You can also use class(Registration) to reset the variable
                                                               We do not need the objects
                                                               I like this way better it gives the right calculations number
                                                               But i think the best way is using it in the constructor
                                                                    Until you want to reset the count


                                                                    Registration.usernameCount++;
                                                                    System.out.println(Registration.usernameCount);



                                                                    Registration.usernameCount++;
                                                                    System.out.println(Registration.usernameCount);



                                                                    Registration.usernameCount=0;
                                                                    System.out.println(Registration.usernameCount);


                                                                    Registration newuser7= new Registration("Maria");
                                                                    Registration.usernameCount++;
                                                                    System.out.println(Registration.usernameCount);




 */
public class Main {
    public static void main(String[] args) {
        //5 days later....
        Registration newuser1= new Registration("Mary");
        System.out.println(newuser1.putUsernameDatabase()+ " username created and entered into database");

        //1 hour later....
        Registration newuser2= new Registration("Larry");
        System.out.println(newuser2.putUsernameDatabase()+ " username created and entered into database");

        //Next day
        System.out.println(Registration.getusernameCount());


        //2 years later
        Registration newuser3= new Registration("Sam");
        System.out.println(newuser1.putUsernameDatabase()+ " username created and entered into database");


        //next day
        System.out.println(Registration.getusernameCount());



        Registration.usernameCount++;
        System.out.println(Registration.usernameCount);



        Registration.usernameCount++;
        System.out.println(Registration.usernameCount);



        Registration.usernameCount=0;
        System.out.println(Registration.usernameCount);



        Registration.usernameCount++;
        System.out.println(Registration.usernameCount);
    }
}
