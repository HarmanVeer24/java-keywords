// Main class to test the Patient class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects
        Patient patientOne = new Patient(101, "Aman", 22, "Fever");
        Patient patientTwo = new Patient(102, "Adarsh", 23, "Cold");

        // Displaying patient details
        patientOne.showPatientDetails();
        System.out.println();
        patientTwo.showPatientDetails();

        // Displaying total patients admitted
        Patient.displayTotalPatients();
    }
}

// Patient class representing hospital patients
class Patient {
    private static String medicalCenter = "City Hospital"; // Static variable shared across all patients
    private static int admittedPatients = 0; // Static counter for total patients
    private final int patientID; // Final variable (Unique ID for each patient)
    private String patientName;
    private int patientAge;
    private String diagnosis;

    // Constructor using 'this' to resolve ambiguity
    public Patient(int patientID, String patientName, int patientAge, String diagnosis) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.diagnosis = diagnosis;
        admittedPatients++; // Increment patient count
    }

    // Method to display patient details
    public void showPatientDetails() {
        if (this instanceof Patient) { // Using instanceof
            System.out.println("Hospital Name: " + medicalCenter);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + patientName);
            System.out.println("Age: " + patientAge);
            System.out.println("Diagnosis: " + diagnosis);
        }
    }

    // Static method to display total number of patients
    public static void displayTotalPatients() {
        System.out.println("Total Patients Admitted: " + admittedPatients);
    }
}


//output
//Hospital Name: City Hospital
//Patient ID: 101
//Name: Aman
//Age: 22
//Ailment: Fever
//
//Hospital Name: City Hospital
//Patient ID: 102
//Name: Adarsh
//Age: 23
//Ailment: Cold
//Total Patients Admitted: 2