package Patterns;
import java.util.Scanner;

public class pat10 {
    public static void main(String[] args) {
        System.out.println("Enter row number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for (int i=1;i<=n;i++){
            if(i%2==0) a=0;             //starting number in a line
            else a=1;
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                if(a==0) a=1;
                else if(a==1)  a=0;
            }
            System.out.println();
        }

    }
}
