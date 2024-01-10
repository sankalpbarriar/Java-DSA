package numbersystem;
import java.util.Scanner;
public class binaryTodecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any binary number:");
        int n=sc.nextInt();
        int ans=0;
        int pow=1;   // 2^0=1
        while(n>0){
            int ud=n%10;   //gives the unit digit of the number
            ans+=(ud*pow);
            n/=10;            //incrementation of the number
            pow*=2;          // increment of power of 2
        }
        System.out.println(ans);
    }
}
