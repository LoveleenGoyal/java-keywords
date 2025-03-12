class Vehicle {
    // Static variable
    private static double registrationFee = 10000.0;

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: Rs" + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using 'instanceof' to check object type
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: Rs" + registrationFee);
        }
    }
}
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle("ABC123", "Loveleen", "Car" );
        Vehicle veh2 = new Vehicle("XYZ789", "Yagyata", "Motorcycle");

        System.out.println("----Vehicle 1----");
        veh1.displayVehicleDetails();
        System.out.println("----Vehicle 2----");
        veh2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1200.0);
        System.out.println();
        veh1.displayVehicleDetails();
    }
}
