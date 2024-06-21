//packages are group of classes
//built-in packages
// import package.name.* (all packages)
//import package.name.Class (single package)

import java.util.Scanner;

public class Main {

    static void staticMethod() {
        System.out.println("just testing static method");
    }

    public void publicMethod() {
        System.out.println("just testing void method");
    }

    public static void main(String[] args) {

        Second sec = new Second();
        System.out.println("Hello world!! >>>>>  " + sec.fname + sec.lname + " " + sec.age);
        sec.doSomething();

        MyCar myCar = new MyCar();
        myCar.fullThrottle();
        myCar.speed(200);

        Student student = new Student();
        student.fname = "AliAce";
        student.lname = "Hamson";
        student.age = 17;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Discipline");
        String discipline = scanner.nextLine();
        student.setDiscipline(discipline);
        student.eatTime();
        student.sleepTime();
        student.workType();
        // inner class demonstration
        Student.StudentType studentType = student.new StudentType();
        String stdTyp = studentType.studentType = "Part Time";
        int wrkHrs = studentType.displayWorkHours();
        System.out.println("My name is >>>>>  " + student.fname + student.lname + " and i am " + student.age
                + ", i am studying " + student.getDiscipline() + " " + stdTyp + " I work" + wrkHrs + " per week");

        Worker worker = new Worker();
        worker.fname = "Donald";
        worker.lname = "Smith";
        worker.age = 37;
        System.out.println("Enter Salary");
        String salary = scanner.nextLine();
        System.out.println(
                "My name is >>>>>  " + worker.fname + worker.lname + " and i am " + worker.age + " earning:" + salary);
        worker.eatTime();
        worker.sleepTime();
        worker.workType();

        // called directly cos its a static method
        staticMethod();

        // needs to create the instance of its object before it is called
        Main main = new Main();
        main.publicMethod();
    }
}
