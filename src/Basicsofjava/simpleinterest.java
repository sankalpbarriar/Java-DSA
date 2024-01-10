package Basicsofjava;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p=sc.nextInt();
        System.out.println("Enter thr rate of interest");
        double r=sc.nextInt();
        System.out.println("enter the time period");
        double t=sc.nextInt();
        double si=(p*r*t)/100;
        System.out.println("Your si is :"+si);
    }
}
