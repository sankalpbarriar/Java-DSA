package Patterns;
import java.util.Scanner;
public class pat7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows:");
        int r=sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=r+2;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
