//Number Rectangular Pattern
package Patterns;
import java.util.Scanner;
public class pat6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=i;j<=r;j++){
                System.out.print(j);
            }
            for (int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
