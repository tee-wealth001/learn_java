//inheritance this is a sub class
public class Student extends Human{

    //encapsulation - sensitive data is hidden from users
    // getter setters helps assessing this 
    private String discipline;


    //getter
    public String getDiscipline(){
        return this.discipline;
    }

    //setter
    public void setDiscipline(String newDiscipline){
        this.discipline = newDiscipline;
    }


    // inherited method from the Human class
    // polymorphism - many forms
    //polymorphed from the parent superclass
    @Override
    void eatTime() {
        System.out.println("I eat 3 times daily");
    }

    @Override
    void sleepTime() {
        System.out.println("I sleep 6hrs daily");
    }

    @Override
    void workType() {
        System.out.println("I study everyday");
    }

    // inner class is allowed
    public class StudentType{
        public String studentType;
    }
    
}
