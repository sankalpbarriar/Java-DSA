package Patterns;
import java.util.Scanner;
public class pat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");            // n-1 spaces
            }
            for (int k=1;k<=i;k++){                 //print 1 to i
                System.out.print(k+" ");
            }
            for (int l=i-1;l>=1;l--){             //print i-1 to 1
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
}