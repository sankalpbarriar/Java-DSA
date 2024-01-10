package Arrays;
import java.util.Scanner;
public class palindome {
    static int pali(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("enter any number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=pali(n);
        if(n==reverse){
            System.out.println("Entered number is a PALINDROME");
        }
        else System.out.println("Entered number is not a PALINDROME");
    }
}
