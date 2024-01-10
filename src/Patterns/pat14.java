package Patterns;
import java.util.Scanner;
public class pat14 {
    public static void main(String[] args) {
        System.out.println("Enter no, of rows:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for (int i=1;i<=n;i++){
            if(i%2==0) a=2;
            else a=1;
            for (int j=1;j<=n;j++){
                System.out.print(a+" ");
                if(a==1) a=2;
                else if (a==2) a=1;
            }
            System.out.println();
        }
    }

}
