// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Vehicle("XYZ123", "Aman", "Car");
        Vehicle vehicleTwo = new Vehicle("ABC789", "Raj", "Motorcycle");

        vehicleOne.showVehicleDetails();
        vehicleTwo.showVehicleDetails();
    }
}

class Vehicle {
    private static double registrationCost = 500; // Static variable
    private final String regNumber; // Final variable
    private String owner;
    private String type;

    public Vehicle(String regNumber, String owner, String type) {
        this.regNumber = regNumber;
        this.owner = owner;
        this.type = type;
    }

    public void showVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + regNumber);
            System.out.println("Owner Name: " + owner);
            System.out.println("Vehicle Type: " + type);
            System.out.println("Registration Fee: Rs." + registrationCost);
        }
    }
}

//output
//Registration Number: XYZ123
//Owner Name: Aman
//Vehicle Type: Car
//Registration Fee: Rs.500.0
//Registration Number: ABC789
//Owner Name: Raj
//Vehicle Type: Motorcycle
//Registration Fee: Rs.500.0