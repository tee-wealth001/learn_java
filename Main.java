//packages are group of classes
//built-in packages
// import package.name.* (all packages)
//import package.name.Class (single package)

// threads allows a program to operate more efficiently by doing multiple things at the same time
// used to perfrom complicated task in the background without interrupting the main program
// you create a thread either by extending the thread class and overiding the run or
// you implement the runnable interface
public class Main extends Thread implements Runnable {

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("This code is running in a thread");
    }

    static void staticMethod() {
        System.out.println("just testing static method");
    }

    public void publicMethod() {
        System.out.println("just testing void method");
    }

    public static void main(String[] args) {

        // can only be done when the main class extends THREAD
        Main thread = new Main();
        thread.start();
        System.out.println("This is outside of the thread");

        // helps prevent concurency problems 
        while (thread.isAlive()){
            System.out.println("Waiting............");
        }

        // if the class implements runnable, the thread can be run by passing an instance of the 
        // class to a thread objects contructor and then calling the thread's start() method.
        Main obj = new Main();
        Thread thread1 = new Thread(obj);
        thread1.start();
        System.out.println("Testing the implement runnable");

        // Second sec = new Second();
        // System.out.println("Hello world!! >>>>> " + sec.fname + sec.lname + " " +
        // sec.age);
        // sec.doSomething();

        // MyCar myCar = new MyCar();
        // myCar.fullThrottle();
        // myCar.speed(200);
        // myCar.fuelConsumption();

        // Student student = new Student();
        // student.fname = "AliAce";
        // student.lname = "Hamson";
        // student.age = 17;
        // // Try-With-Resources: This construct ensures that the Scanner (or any other
        // // AutoCloseable resource) is closed automatically at the end of the block,
        // // regardless of whether an exception is thrown.
        // try (Scanner scanner = new Scanner(System.in)) {
        // // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter Discipline");
        // String discipline = scanner.nextLine();
        // student.setDiscipline(discipline);
        // student.eatTime();
        // student.sleepTime();
        // student.workType();
        // // inner class demonstration
        // Student.StudentType studentType = student.new StudentType();
        // String stdTyp = studentType.studentType = "Part Time";
        // int wrkHrs = studentType.displayWorkHours();
        // System.out.println("My name is >>>>> " + student.fname + student.lname + "
        // and i am " + student.age
        // + ", i am studying " + student.getDiscipline() + " " + stdTyp + " I work" +
        // wrkHrs + " per week");

        // Worker worker = new Worker();
        // worker.fname = "Donald";
        // worker.lname = "Smith";
        // worker.age = 37;
        // System.out.println("Enter Salary");
        // double salary = scanner.nextDouble();
        // System.out.println(
        // "My name is >>>>> " + worker.fname + worker.lname + " and i am " + worker.age
        // + " earning:"
        // + salary);
        // worker.eatTime();
        // worker.sleepTime();
        // worker.workType();
        // }

        // // called directly cos its a static method
        // staticMethod();

        // // needs to create the instance of its object before it is called
        // Main main = new Main();
        // main.publicMethod();

        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // System.out.println(date + " " + time);

        // LocalDateTime dateTime = LocalDateTime.now();

        // DateTimeFormatter formatedDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy
        // HH:mm:ss");
        // String stringifiedFormattedDateTime = dateTime.format(formatedDateTime);
        // System.out.println(dateTime + " <<<<>>>>" + stringifiedFormattedDateTime);

        ArrayLearning arrayLearning = new ArrayLearning();

        RegExLearning regExLearning = new RegExLearning();
    }
}
