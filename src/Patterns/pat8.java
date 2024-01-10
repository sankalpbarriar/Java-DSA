package Patterns;
import java.util.Scanner;
public class pat8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");     // initial row
            }
            for (int k=1;k<=2*(n-i);k++){       //2*(n-1) spaces in each row
                System.out.print("  ");
            }
            for (int l=i;l>=1;l--){                //counting starts from current row no.
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
