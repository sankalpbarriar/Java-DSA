package consditions;
import java.util.Scanner;
public class threedigit {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a positive integer");
        int n=sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("the number is a three digit number");
        }
        else System.out.println("not a 3 digit number");
    }
}
