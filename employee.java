
abstract class Employee {

    String name;
    int empID;
    private double salary;

    // 1. Constructor
    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    // 2. Encapsulation
    public double getSalary() {
        return salary;
    }

    // 3. Abstract method
    abstract double calculateSalary();
}

// 4. Full-time employee
class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int empID, double salary) {
        super(name, empID, salary);
    }

    @Override
    double calculateSalary() {
        return getSalary() + 5000;
    }
}

// 5. Part-time employee
class PartTimeEmployee extends Employee {

    int hours;
    double rate;

    PartTimeEmployee(String name, int empID,
                     double salary, int hours, double rate) {
        super(name, empID, salary);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

// 6. Main class
public class employee {

    public static void main(String[] args) {

        // Runtime polymorphism
        Employee e1 = new FullTimeEmployee("Hemanth", 101, 25000);

        Employee e2 = new PartTimeEmployee("Rahul", 102, 0, 80, 150);

        // Full-time employee details
        System.out.println("Full-Time Employee Details");
        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.empID);
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        // Part-time employee details
        System.out.println("Part-Time Employee Details");
        System.out.println("Name: " + e2.name);
        System.out.println("ID: " + e2.empID);
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
