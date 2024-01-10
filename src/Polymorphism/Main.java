package Polymorphism;

import Access.A;

public class Main extends A{
    public Main(int num, String name){
        super(num,name);
    }
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square =new Square();

        shape.area();
        circle.area();
        square.area();
//        A a=new A(34,"sanky");
//        System.out.println(a.num);     // since num is protected it can not be accessed even with its own class

        Main obj2=new Main(99,"barriar");
        System.out.println(obj2.num);   //protected member can only be accessed by subclass
    }
}
