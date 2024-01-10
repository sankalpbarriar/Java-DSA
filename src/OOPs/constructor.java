package OOPs;

public class constructor {
    public static void main(String[] args) {
       Students s1=new Students(111,"karan");  //passing arguments to the constructor
       Students s2=new Students(121,"Sankalp");
       Students s3=new Students();    //default constructor
       s3.dispaly();
       s1.dispaly();
       s2.dispaly();
    }
}
class Students{
    int id;
    String name;
    // creating Parametrized constructor
    //Student arpit=new Student(17,"arpit")
    //here, this will be replaced with arpit
    Students(int id, String name){
        this.id=id;    //it is basically S1.id=id (passed)
        this.name=name;   // S1.name=name (passed)
    }
    Students(){
        this.id=45;
        this.name="Kiran";
    }
    void dispaly(){
        System.out.println(id+" "+name);
    }

}
