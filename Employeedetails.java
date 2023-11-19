class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;

    EMPLOYEE(String name, int id, double basic) {
        Ename = name;
        Eid = id;
        Basic = basic;
    }

    double calculateSalary() {
        // Default calculation for base class
        return Basic;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
    }
}

class FullTimeEmp extends EMPLOYEE {
    double bonus;
    double deductions;

    FullTimeEmp(String name, int id, double basic, double bonus, double deductions) {
        super(name, id, basic);
        this.bonus = bonus;
        this.deductions = deductions;
    }

    @Override
    double calculateSalary() {
        return Basic + bonus - deductions;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    static final double hourlyRate = 15.0; // Static and final hourly rate

    PartTimeEmp(String name, int id, int hoursWorked) {
        super(name, id, 0); // Initialize basic as 0 for part-time employees
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

public class Employeedetails{
    public static void main(String[] args) {
        // Create FullTimeEmp object
        FullTimeEmp fullTimeEmployee = new FullTimeEmp("Alice", 101, 50000.0, 5000.0, 3000.0);

        // Create PartTimeEmp object
        PartTimeEmp partTimeEmployee = new PartTimeEmp("Bob", 102, 40);

        // Display FullTimeEmp details
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayEmployeeDetails();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println();

        // Display PartTimeEmp details
        System.out.println("Part-Time Employee Details:");
        partTimeEmployee.displayEmployeeDetails();
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}
