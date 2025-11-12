public class Student{
    // instance variable
    String sname;
    String branch;
    int rollno;
    //static variable
    static String collegeName="AVN";
    void print(){
        //local variable
        String msg="These are TNS students";
        System.out.println(msg);
        System.out.println("The student details are "+sname+" "+branch+" "+rollno+" "+collegeName);
    }
}