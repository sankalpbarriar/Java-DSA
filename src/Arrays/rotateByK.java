//ROTATE BY 'K' STEPS
//Rotate an array 'a' by k steps, where k is an non-negative integer. NOTE--> K can be greater than n as well

package Arrays;

import java.util.Scanner;

public class rotateByK {
    static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int []ans=new int[n];
        int j=0;

        for (int i=n-k;i<n;i++){     //2 nd half of array shifted to begining
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){    //1st half of array shifted to last
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k=sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);
        int ans[]=rotate(arr,k);
        System.out.println("array after rotation:");
        printArray(ans);
    }
}
