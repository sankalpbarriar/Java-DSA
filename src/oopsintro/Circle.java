package oopsintro;
import java.util.Scanner;
 class Circle {
    float radius;  //instance variable
    void getRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in meters:");
        radius = sc.nextFloat();
    }
    float getArea(){
        return (float)Math.PI*((float)Math.pow(radius,2));
    }
    float getCicumference(){
        return 2*(float)Math.PI*radius;
    }
}
