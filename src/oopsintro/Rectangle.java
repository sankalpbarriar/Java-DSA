package oopsintro;

import java.util.Scanner;

public class Rectangle {
    int l;
    int b;
    void acceptData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();
    }
    void showData(){
        System.out.println("Length is :" + l);
        System.out.println("Breadth is " + b);
    }

    void getArea(){
        System.out.println("Area is :"+ l*b);
    }

    void getPeri(){
        System.out.println("perimeter is :"+ 2*(l+b));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.l);
        System.out.println(r.b);
    }
}
