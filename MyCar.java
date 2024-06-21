// overrides all methods from the interface(vehicle) it implements
// a class can implement multiple interfaces
// these implemented methods are from different interfaces
public class MyCar implements Vehicle, AutoMobile{

    // from vehicle
    @Override
    public void fullThrottle() {
        System.out.println("The car is going too fast as it can!");
    }
    // from vehicle
    @Override
    public void speed(int maxSpeed) {
        System.out.println("The Max Speed is: " + maxSpeed);
    }
    // from automobile
    @Override
    public void fuelConsumption() {
        System.out.println("I consume fuel alot");
    }
}
