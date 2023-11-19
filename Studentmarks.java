// Define the base class STUDENT
class STUDENT {
    private String name;
    private int rollNo;
    protected double totalMarks;
    protected double averageMarks;

    public STUDENT(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = 0;
        this.averageMarks = 0;
    }

    public void compute() {
        // Compute total and average marks based on individual subject marks.
        // This method can be overridden in subclasses for specialized behavior.
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

// Define the ScienceStudent subclass
class ScienceStudent extends STUDENT {
    private int practicalMarks;

    public ScienceStudent(String name, int rollNo, int practicalMarks) {
        super(name, rollNo);
        this.practicalMarks = practicalMarks;
    }

    @Override
    public void compute() {
        super.compute(); // Call the base class compute() method
        totalMarks += practicalMarks;
        averageMarks = totalMarks / 6.0; // Assuming 5 subjects + practical
    }

    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

// Define the ArtsStudent subclass
class ArtsStudent extends STUDENT {
    private String electiveSubject;

    public ArtsStudent(String name, int rollNo, String electiveSubject) {
        super(name, rollNo);
        this.electiveSubject = electiveSubject;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    @Override
    public void compute() {
        super.compute(); // Call the base class compute() method
        // Additional logic for ArtsStudent, if needed
    }
}

public class Studentmarks{
    public static void main(String[] args) {
        // Create a STUDENT object
        STUDENT student = new STUDENT("John", 101);
        student.compute();
        student.displayInfo();

        // Create a ScienceStudent object
        ScienceStudent scienceStudent = new ScienceStudent("Alice", 201, 95);
        scienceStudent.compute();
        scienceStudent.displayInfo();
        scienceStudent.displayPracticalMarks();

        // Create an ArtsStudent object
        ArtsStudent artsStudent = new ArtsStudent("Bob", 301, "History");
        artsStudent.compute();
        artsStudent.displayInfo();
    }
}
