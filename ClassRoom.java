// Program: Display Classroom Information using Instance Variables

// Logic Class
public class ClassRoom {
    // Instance variables (each classroom has its own values)
    int chairs;
    int benches;
    int fans;

    // Method to display classroom details
    void totalStudents() {
        // Local variable
        int totalCapacity = chairs; // Assuming one student per chair
        
        // Displaying classroom details
        System.out.println("Classroom Details:");
        System.out.println("Number of Chairs: " + chairs);
        System.out.println("Number of Benches: " + benches);
        System.out.println("Number of Fans: " + fans);
        System.out.println("Total Students that can sit: " + totalCapacity);
        System.out.println("-----------------------------------");
    }
}
