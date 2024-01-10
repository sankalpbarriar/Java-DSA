package loops;
import java.util.Scanner;
public class nto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for (int i=n;i>=1;i-=2){
            System.out.println(i);
        }
    }
}
