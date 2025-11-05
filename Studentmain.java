// Main Class
public class Studentmain {
    public static void main(String[] args) {
        // Creating first student object
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.sName = "Prasanna";
        s1.branch = "ECE";
        s1.mStudent();

        // Creating second student object
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.sName = "Ravi";
        s2.branch = "Mechanical";
        s2.mStudent();
    }
}
