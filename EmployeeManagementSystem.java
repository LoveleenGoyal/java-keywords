class Employee {
    // Static variables
    private static String companyName = "Capgemini";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id;
    private String designation;

    // Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employee count
    }

    // Static method to display company name
    public static void displayCompany() {
        System.out.println("Company: " + companyName);
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using 'instanceof' to check object type
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Loveleen Goyal", 101, "Software Engineer");
        Employee emp2 = new Employee("Yagyata Sharma", 102, "Data Analyst");

        Employee.displayCompany();
        System.out.println("--------------------------");

        System.out.println("Employee 1: ");
        emp1.displayEmployeeDetails();
        System.out.println("\nEmployee 2: ");
        emp2.displayEmployeeDetails();

        System.out.println("--------------------------\n");
        Employee.displayTotalEmployees();

    }

}

/*
Company: Capgemini
--------------------------
Employee 1:
Name: Loveleen Goyal
Employee ID: 101
Designation: Software Engineer

Employee 2:
Name: Yagyata Sharma
Employee ID: 102
Designation: Data Analyst
--------------------------

Total Employees: 2
*/