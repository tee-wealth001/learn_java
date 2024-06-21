public class Second {
    int age;
    String fname = "John";
    String lname = "Doe";

    void doSomething(){
        System.out.println("Here i am !!!!!");
    }

    // constructor is called automatically
    // when an object of a class is called
    // it must match the class name
    // must not have a return type like void or anything
    // can also add a parameter to take in an argument if you want to initialize an attribute with a value
    public Second(){
        age = 49;
    }
}
