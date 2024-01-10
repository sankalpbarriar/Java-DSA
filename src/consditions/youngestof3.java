package consditions;
import java.util.Scanner;
public class youngestof3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Rams age:");
        int r= sc.nextInt();
        System.out.println("Enter Shyam's age:");
        int s= sc.nextInt();
        System.out.println("Enter Ajay's age:");
        int a= sc.nextInt();
        if (r<s){
            if (r<a){
                System.out.println("Ram is youngest");
            }
            else {
                System.out.println("Ajay is the youngest");
            }
        }
        else{
            if (s<a){
                System.out.println("shyam is the youngest");
            }
            else {
                System.out.println("Ajay is the youngest");
            }
        }
    }
}
