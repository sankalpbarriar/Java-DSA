package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();        //call the constructor taking no arguments
        System.out.println(box.l + " " + box.w +" "+ box.h);

        Box box1=new Box(4);         //constructing taking only 1 argument
        System.out.println(box1.l + " " + box1.w +" "+ box1.h);

        Box box2=new Box(4,5,3);   //constructing taking 3 argument
        System.out.println(box2.l + " " + box2.w +" "+ box2.h);

        Box box3=new Box(box2);            //taking object as argument
        System.out.println(box3.l + " " + box3.w +" "+ box3.h);

        BoxWeight box4=new BoxWeight(4,6,7,8);       //BoxWeight extends Box class
        System.out.println(box4.l + " " + box4.w +" "+ box4.h+" "+ box4.weight);

        Box box5=new BoxWeight(2,5,2,6);
        System.out.println(box5.w);

//        BoxWeight box6=new Box(3,5,4);   //cant call the constructor of parent class as parent class dont know about the child class properties
        BoxPrice box7=new BoxPrice(3,6,7);   //will look for constructor in BoxPrice containg 3 args
        System.out.println(box7.weight+" "+box7.cost+" "+box7.side);




    }
}
