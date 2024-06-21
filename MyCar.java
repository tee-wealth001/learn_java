// overrides all methods from the interface(vehicle) it implements
// a class can implement multiple interfaces
public class MyCar implements Vehicle{

    @Override
    public void fullThrottle() {
        System.out.println("The car is going too fast as it can!");
    }

    @Override
    public void speed(int maxSpeed) {
        System.out.println("The Max Speed is: " + maxSpeed);
    }
}
