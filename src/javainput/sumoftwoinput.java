package javainput;
import java.util.Scanner;
public class sumoftwoinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
        int sum=x+y;
        System.out.println(x+y);
    }
}
