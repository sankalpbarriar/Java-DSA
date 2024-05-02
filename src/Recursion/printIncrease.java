package Recursion;
import java.util.*;
public class printIncrease {
    static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");      //BASE CASE or HALTING CONDITION
            return;
        }
        printIncreasing(n-1);          //SUB PROBLEM
        System.out.print(n+" ");          //SELF WORK
    }
    static void printDecreasing(int n){
        //Base Case
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        //Self Work
        System.out.print(n+" ");
        //Recursive work
        printDecreasing(n-1);   //n-1, n-1, ......1
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
      //printIncreasing(n);
        printDecreasing(n);

    }
}
