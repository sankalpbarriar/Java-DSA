package RunTime;

public class Circle extends Shapes{
    //this will run when obj of Circle is
    //created hence it is overriding parent class
    //@override this is call annotation

    void area(){

        System.out.println("This is overriding");
    }

    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.area();
    }

}
