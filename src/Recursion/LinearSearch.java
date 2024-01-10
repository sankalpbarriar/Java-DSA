package Recursion;
import java.util.Scanner;
public class LinearSearch {
    // Return index of target if target is present in Array otherwise return -1
    static int findIndex(int[] arr, int n, int target,int idx){
        //BASE CASE
        if (idx>=n) return -1;               //index bahar hi pahuch chuka hai array se
        //SELF WORK
        if(arr[idx]==target) return idx;
        //RECURSIVE WORK
        return findIndex(arr,n,target,idx+1);
    }
    static boolean findElement(int [] arr, int n,int target, int idx){
        //BASE CASE
        if (idx>=n) return false;               //index bahar hi pahuch chuka hai array se
        //SELF WORK
        if(arr[idx]==target) return true;
        //RECURSIVE WORK
        return findElement(arr,n,target,idx+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
//        if(findElement(arr,n,5,0))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        System.out.println("THE INDEX IS "+findIndex(arr,n,7,0));
    }
}
