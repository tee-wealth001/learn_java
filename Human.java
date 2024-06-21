// use final when you dont want anyother classes to inherit this
// inheritance this is a super class
// abstract - hiding certain details and showing only essential information, cannot be used to create objects
abstract class Human {

    String fname;
    String lname;
    int age;

    // will be polymorphed in the subclasses
    // when abstracted, will never have a body
    abstract void eatTime();

    abstract void sleepTime();

    abstract void workType();
}
