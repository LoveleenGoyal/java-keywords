class Student {
    // Static variable
    private static String universityName = "Chitkara University";

    // Instance variables
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Method to display student details
    public  void displayStudentDetails() {
        if(this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "Loveleen Goyal", "A+");
        Student s2 = new Student(1002, "Yagyata Sharma", "A");

        Student.displayUniversityName();
        System.out.println("---------------------------");
        System.out.println("Student 1:");
        s1.displayStudentDetails();
        System.out.println("\nStudent 2:");
        s2.displayStudentDetails();
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
*/