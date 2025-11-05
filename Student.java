// Program: Display Student Details using Instance and Static Variables

// Logic Class
public class Student {
    // Instance variables (unique for each student)
    int rollNo;
    String sName;
    String branch;

    // Static variable (common for all students)
    static String collegeName = "Global Institute of Technology";

    // Method to display student details
    void mStudent() {
        // Local variable
        String msg = "Welcome to " + collegeName;
        
        // Displaying message and student details
        System.out.println(msg);
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + sName);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + collegeName);
        System.out.println("-----------------------------------");
    }
}
