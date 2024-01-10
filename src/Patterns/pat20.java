//Star pyramid
package Patterns;
import java.util.Scanner;
public class pat20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n=sc.nextInt();
        int nst=1;
        int nsp=n/2;
        int ml= (n/2+1);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            if(i<ml){
                nst+=2;
                nsp--;
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}
