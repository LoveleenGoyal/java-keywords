class Patient {
    // Static variable
    private static String hospitalName = "Neelam Hospital";
    private static int totalPatients = 0;

    // Instance variable
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // INcrement patient count
    }

    // Method to display hospital name
    public static void displayHospitalNAme() {
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Method to display total patients in hospital
    public static void displayTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if(this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "John", 25, "Fever");
        Patient p2 = new Patient(102, "Sam", 31, "Cough and Cold");

        Patient.displayHospitalNAme();
        System.out.println("------------------------------");
        System.out.println("Patient 1:");
        p1.displayPatientDetails();
        System.out.println("\nPatient 2:");
        p2.displayPatientDetails();
        System.out.println("------------------------------");
        Patient.displayTotalPatients();

    }
}

/*
Hospital Name: Neelam Hospital
------------------------------
Patient 1:
Patient ID: 101
Name: John
Age: 25
Ailment: Fever

Patient 2:
Patient ID: 102
Name: Sam
Age: 31
Ailment: Cough and Cold
------------------------------
Total Patients: 2
*/