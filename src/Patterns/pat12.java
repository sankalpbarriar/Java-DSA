package Patterns;
import java.util.Scanner;
public class pat12 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int ch=65;
            for (int j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }


            System.out.println();
        }

    }
}
