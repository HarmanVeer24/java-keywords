// Main class
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee empOne = new Employee(1, "Aman", "Software Engineer");
        Employee empTwo = new Employee(2, "Adarsh", "Manager");

        empOne.showEmployeeDetails();
        empTwo.showEmployeeDetails();
        Employee.showTotalEmployees();
    }
}

class Employee {
    private static String organizationName = "Tech Corp"; // Static variable
    private static int employeeCount = 0; // Static counter
    private final int employeeId; // Final variable
    private String employeeName;
    private String jobTitle;

    public Employee(int employeeId, String employeeName, String jobTitle) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        employeeCount++;
    }

    public void showEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof
            System.out.println("Company: " + organizationName);
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Designation: " + jobTitle);
        }
    }

    public static void showTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

//output
//Company: Tech Corp
//ID: 1
//Name: Aman
//Designation: Software Engineer
//Company: Tech Corp
//ID: 2
//Name: Adarsh
//Designation: Manager
//Total Employees: 2