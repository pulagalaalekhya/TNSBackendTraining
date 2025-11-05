// Main Class
public class ClassRoomMain {
    public static void main(String[] args) {
        // Creating object for ClassRoom
        ClassRoom cr = new ClassRoom();

        // Assigning values to instance variables
        cr.chairs = 40;
        cr.benches = 20;
        cr.fans = 5;

        // Calling method to display details
        cr.totalStudents();
    }
}
