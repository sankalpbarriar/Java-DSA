package oopsintro;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getRadius();
        float area = c.getArea();
        System.out.println("Area is: "+ area +" m^2");
        float circumference = c.getCicumference();
        System.out.println("Circumference of circle is: "+circumference+" m");
    }
}
