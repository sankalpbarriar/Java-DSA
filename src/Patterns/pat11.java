package Patterns;
import java.util.Scanner;
public class pat11 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner sc= new Scanner(System.in);
        int ch=65;
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)ch+" ");

            }
            ch++;
            System.out.println();
        }

    }
}
