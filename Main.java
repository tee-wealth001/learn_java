//packages are group of classes
//built-in packages
// import package.name.* (all packages)
//import package.name.Class (single package)

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
        myCar.fuelConsumption();

        Student student = new Student();
        student.fname = "AliAce";
        student.lname = "Hamson";
        student.age = 17;
        // Try-With-Resources: This construct ensures that the Scanner (or any other
        // AutoCloseable resource) is closed automatically at the end of the block,
        // regardless of whether an exception is thrown.
        try (Scanner scanner = new Scanner(System.in)) {
            // Scanner scanner = new Scanner(System.in);
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
            double salary = scanner.nextDouble();
            System.out.println(
                    "My name is >>>>>  " + worker.fname + worker.lname + " and i am " + worker.age + " earning:"
                            + salary);
            worker.eatTime();
            worker.sleepTime();
            worker.workType();
        }

        // called directly cos its a static method
        staticMethod();

        // needs to create the instance of its object before it is called
        Main main = new Main();
        main.publicMethod();

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date + " " + time);

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatedDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String stringifiedFormattedDateTime = dateTime.format(formatedDateTime);
        System.out.println(dateTime + " <<<<>>>>" + stringifiedFormattedDateTime);

    }
}
