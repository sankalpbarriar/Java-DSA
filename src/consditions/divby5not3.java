package consditions;
import java.util.Scanner;
public class divby5not3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a positive number");
        int n =sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("the conditon is satisfied");
        }
        else System.out.println("not satisfies");

    }
}
