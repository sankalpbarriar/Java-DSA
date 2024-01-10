package Recursion;
import java.util.Scanner;
public class arraySum {
    static int maxValue(int[] arr, int idx) {
        if (idx == arr.length - 1)             //BASE CASE => if only one element in array
            return arr[idx];
        int smallAns = maxValue(arr,idx+1);     //SMALL ANS=> return mx value starting from index idx+1

        return Math.max(arr[idx], smallAns);    //SELF WORK=> compare arr[idx] and smallAns
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the Array:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter the elements of the array;");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The largest element is :"+maxValue(arr,0));

    }
}
