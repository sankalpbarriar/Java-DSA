package javainput;
import java.util.Scanner;
//program to find the remainder when a/b
public class hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Dividend:");
        int a=sc.nextInt();
        System.out.println("Enter the divisor:");
        int b=sc.nextInt();
        int quo=a/b;
        int result=a-b*quo;
        System.out.println("The remainder when "+a+" is divided by "+b+" is "+result);

    }
}
