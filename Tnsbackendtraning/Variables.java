public class Variables {
    public static void main(String[] args) {
        //objects of Students class.
        Students oj1=new Students();
        oj1.name="Akki";
        oj1.rollnum="225U1A0511";
        System.out.println("the students are:"+oj1.name+"\n"+oj1.rollnum+"\n"+oj1.college);
        oj1.branches();
        Students oj2=new Students();
        oj2.name="Alekhya";
        oj2.rollnum="225U1A05E8";
        System.out.println("the students are:"+oj2.name+"\n"+oj2.rollnum+"\n"+oj2.college);
        oj2.branches();
        Students oj3=new Students();
        oj3.name="Akhil";
        oj3.rollnum ="225U1A0596";
        System.out.println("the students are:"+oj3.name+"\n"+oj3.rollnum+"\n"+oj3.college);
        oj3.branches();
    }
    
}
