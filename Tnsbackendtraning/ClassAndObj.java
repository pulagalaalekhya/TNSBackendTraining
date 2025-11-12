//main class for cartoon class
class ClassAndObj{
public static void main(String[] args) {
        //creating an object of cartoon class.
        Bikes obj=new Bikes();
        obj.name="Shine 100";
        obj.company="Honda";
        obj.Type="Petrol";
        obj.Milage=65;
        //creating a second object of cartoon class.
        Bikes obj1=new Bikes();
        obj1.name="RayZR";
        obj1.company="Yamaha";
        obj1.Type="Petrol";
        obj1.Milage=100;
        //creating a third object of cartoon class.
        Bikes obj2=new Bikes();
        obj2.name="Royal Enfield 350cc";
        obj2.company="Eicher";
        obj2.Type="Petron";
        obj2.Milage=38;
        System.out.println("the bike which i like so much are:"+obj.name+"\n"+obj.company+"\n"+obj.Type+"\n"+obj.Milage);
        System.out.println("the bike which i like so much are:"+obj1.name+"\n"+obj1.company+"\n"+obj1.Type+"\n"+obj1.Milage);
        System.out.println("the bike which i like so much are:"+obj2.name+"\n"+obj2.company+"\n"+obj2.Type+"\n"+obj2.Milage);
    }
}