package Patterns;
import java.util.Scanner;
public class pat13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            int ch = 65;
            for (int j=n;j>=i;j--) {

                System.out.print((char) ch + " ");
                ch++;
            }

            System.out.println();

        }
    }
}
