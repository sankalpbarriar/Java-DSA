package Patterns;
import java.util.Scanner;
public class pat9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                         //1
        System.out.println("Enter row number");                     //2 3
        int n= sc.nextInt();                                        //4 5 6
        int num=1;                                                  //7 8 9 10
        for (int i=1;i<=n;i++){                                     //11 12 13 14 15
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }
}
