package problemsonloops;
import java.util.Scanner;
public class reversing {
    static int reverse(int num){
        int ans=0;
        int x=Math.abs(num);    //removing negative cases
        while(x>0){
            int last=x%10;
            ans=(ans*10)+last;
            x/=10;
        }
        return (num<0)? -ans :ans;    //check for negative integer
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}
