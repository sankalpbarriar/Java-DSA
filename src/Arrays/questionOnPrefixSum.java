package Arrays;

import java.util.Scanner;

public class questionOnPrefixSum {
    static int[] makePrefixArray(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements of Array");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum=makePrefixArray(arr);
        System.out.println("enter the no. of queries");
        int q=sc.nextInt();
        while (q-- >0){
            System.out.println("Enter the range; ");
            int l= sc.nextInt();;
            int r=sc.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("SUM "+ans);
        }
    }

    }

