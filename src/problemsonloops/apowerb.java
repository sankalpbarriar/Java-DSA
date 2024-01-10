package problemsonloops;
import java.util.Scanner;
public class apowerb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt(),b=sc.nextInt();
        int ans=1;
        for (int i=1;i<=b; i++){
            ans*=b;
        }
        System.out.println(a+" raise to "+b+" is "+ans);
    }
}
