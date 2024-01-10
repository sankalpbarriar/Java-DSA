package consditions;
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length and the bredth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        int peri=2*(l+b);
        if (area>peri){
            System.out.println("area is greater than perimeter");
        }
        if (area==peri){
            System.out.println("area=perimeter");
        }
        else{
            System.out.println("area is less than perimeter");
        }
    }
}
