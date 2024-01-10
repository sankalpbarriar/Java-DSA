package Recursion;
import java.util.Scanner;
public class printMultiple {
    static void printMul(int n, int k){
        //BASE CASE
        if(k==1){
            System.out.print(n+" ");
            return;
        }

        //RECURSIVE WORK
         printMul(n,k-1);    // 5 10 15

        //SELF WORK
        System.out.print(n*k+" ");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,k;
        System.out.println("Enter n:");
        n=sc.nextInt();
        System.out.println("Enter k:");
        k=sc.nextInt();
        printMul(n,k);

    }
}
