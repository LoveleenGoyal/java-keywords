class UniStudent {
    // Static variable
    private static String universityName = "Chitkara University";
    private static int totalStudents = 0;

    // Instance variables
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor
    public UniStudent(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment
    }

    // Method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Method to display Total Students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display student details
    public  void displayStudentDetails() {
        if(this instanceof UniStudent) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        UniStudent s1 = new UniStudent(1001, "Loveleen Goyal", "A+");
        UniStudent s2 = new UniStudent(1002, "Yagyata Sharma", "A");

        UniStudent.displayUniversityName();
        System.out.println("---------------------------");
        System.out.println("Student 1:");
        s1.displayStudentDetails();
        System.out.println("\nStudent 2:");
        s2.displayStudentDetails();

        System.out.println();
        UniStudent.displayTotalStudents();
    }
}

/*
University Name: Chitkara University
---------------------------
Student 1:
Roll Number: 1001
Name: Loveleen Goyal
Grade: A+

Student 2:
Roll Number: 1002
Name: Yagyata Sharma
Grade: A

Total Students: 2
*/