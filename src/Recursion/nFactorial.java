package Recursion;
import java.util.*;
public class nFactorial {
    static int findFactorial(int n){
        //BASE CASE
        if (n==0){
            return 1;
        }
        else{
            return n*findFactorial(n-1);   //SelfWork X SmallerProblem
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=findFactorial(n);
        System.out.println("THE FACTORIAL OF "+n+" is "+fact);
    }
}
