package oopsintro;
class Students{
    int rollNo;
    String Name;
}
public class Main {
    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.rollNo=10;
        obj1.Name="Sankalp";
        System.out.println(obj1.Name);
        System.out.println(obj1.rollNo);
        Students obj2=new Students();
        obj2.rollNo=11;
        obj2.Name="Prerna";
        System.out.println(obj2.Name);
        System.out.println(obj2.rollNo);


    }
}
