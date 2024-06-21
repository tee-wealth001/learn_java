//inheritance this is a sub class
public class Worker  extends Human{

    public  String salary;
    
    // inherited method from the Human class
    // polymorphed from the parent superclass
    @Override
    void eatTime() {
        System.out.println("I eat 1 times daily");
    }

    @Override
    void sleepTime() {
        System.out.println("I sleep 4hrs daily");
    }

    @Override
    void workType() {
        System.out.println("I work everyday");
    }
    
}
