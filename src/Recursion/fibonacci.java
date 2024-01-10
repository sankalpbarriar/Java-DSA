package Recursion;
import java.util.Scanner;
public class fibonacci {
    static int findFibonacci(int n){
        //BASE CASE
        if(n==0 || n==1){
            return n;
        }
        else{
            return findFibonacci(n-1)+findFibonacci(n-2);  //+ IS SELF WORK
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(findFibonacci(i));
        }
    }


}
