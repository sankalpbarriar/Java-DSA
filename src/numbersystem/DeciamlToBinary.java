package numbersystem;
import java.util.Scanner;
public class DeciamlToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any decimal no.:");
        int n=sc.nextInt();
        int ans=0;
        int pow=1;
        while(n>0){
            int parity=n%2;
            ans+=(parity*pow);
            pow*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
