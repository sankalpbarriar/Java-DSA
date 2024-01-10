package OOPs;


public class instance {
    public static void main(String[] args) {
        Student s1=new Student();   //object creation
        System.out.println(s1.name);    //by default-Null
        System.out.println(s1.rollNo);  //by default-0
        System.out.println(s1.marks);   //by default-0.0

        s1.greeting();
    }
}
class  Student{
    int rollNo;
    String name;
    void greeting(){
        System.out.println("Hello my name is "+name);
    }
    //Constructor
    Student(){
        this.name="Sankalp";
        this.rollNo=187;
        this.marks=91.8f;
    }
    float marks;
}
