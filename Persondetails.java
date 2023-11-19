class Person {
    private String name;
    private String birthDate;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}

class CollegeGraduate extends Person {
    private double GPA;
    private int graduationYear;

    public CollegeGraduate(String name, String birthDate, double GPA, int graduationYear) {
        super(name, birthDate);
        this.GPA = GPA;
        this.graduationYear = graduationYear;
    }

    // Accessor methods
    public double getGPA() {
        return GPA;
    }

    public int getGraduationYear() {
        return graduationYear;
    }
}

public class Persondetails{
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", "1990-01-15");

        // Create a CollegeGraduate object
        CollegeGraduate graduate = new CollegeGraduate("Alice Smith", "1995-05-20", 3.75, 2021);

        // Display Person details
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Birth Date: " + person.getBirthDate());
        System.out.println();

        // Display CollegeGraduate details
        System.out.println("College Graduate Details:");
        System.out.println("Name: " + graduate.getName());
        System.out.println("Birth Date: " + graduate.getBirthDate());
        System.out.println("GPA: " + graduate.getGPA());
        System.out.println("Graduation Year: " + graduate.getGraduationYear());
    }
}
