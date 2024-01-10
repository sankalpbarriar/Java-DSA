package Arrays;
import java.util.Scanner;
public class prefixSum {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] printPrefixSum2(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
//    static int[] makePrefixSum(int[] arr){
//        int n=arr.length;
//        int[] pre=new int[n];
//        pre[0]=arr[0];
//
//        for (int i=1;i<n;i++) {
//
//                pre[i] = pre[i-1] + arr[i];
//
//        }
//        return pre;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array is:");
        printArray(arr);
        System.out.println();
        int[] pref=printPrefixSum2(arr);
        System.out.println("PREFIX ARRAY:");
        printArray(pref);
    }

}
