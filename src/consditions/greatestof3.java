package consditions;
import java.util.Scanner;
public class greatestof3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is greatest");
        } else if (a>b && a>c) {
            System.out.println("a is greatest");
        }
        else System.out.println("c is greatest");

    }
}
