//this is an interface which is a completely abstract class
//cannot be used to create objects
//they do not have a body in their method
// methods are by default: abstract and public
// attributes are by default: public, static and final
// cannot contain a constructor as it cannot be used to create objects
// a class can implement multiple interfaces which is better than using abstract class
interface Vehicle {

    public void fullThrottle();
    public void speed(int speed);
}

// trying to implement multiple interfaces
interface AutoMobile {

    public void fuelConsumption();
}