package problemsonloops;
import java.util.Scanner;
public class sumofDigits {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sumOfDigits=0;
        while(n>0){
            sumOfDigits+=n%10;
            n=n/10;


        }
        System.out.println("the sum of digits is "+ sumOfDigits);

    }
}
