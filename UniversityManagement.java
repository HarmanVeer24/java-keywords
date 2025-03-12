// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        Student studentOne = new Student(101, "Aman", "A");
        Student studentTwo = new Student(102, "Adarsh", "B");

        studentOne.showStudentDetails();
        studentTwo.showStudentDetails();
    }
}

class Student {
    private static String instituteName = "RGPV University"; // Static variable
    private final int studentID; // Final variable
    private String studentName;
    private String studentGrade;

    public Student(int studentID, String studentName, String studentGrade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public void showStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + instituteName);
            System.out.println("Roll Number: " + studentID);
            System.out.println("Name: " + studentName);
            System.out.println("Grade: " + studentGrade);
        }
    }
}

//output
//University: RGPV University
//Roll Number: 101
//Name: Aman
//Grade: A
//University: RGPV University
//Roll Number: 102
//Name: Adarsh
//Grade: B


