// use final when you dont want anyother classes to inherit this
// inheritance this is a super class
abstract class Human {

    String fname;
    String lname;
    int age;

    // will be polymorphed in the subclasses
    abstract void eatTime();

    abstract void sleepTime();

    abstract void workType();
}
