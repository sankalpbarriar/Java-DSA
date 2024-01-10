package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Kthsmallest {

    static int kth(int k,int[]arr){
        Arrays.sort(arr);
        return arr[k - 1];
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
        System.out.println("Enter the value of K:");
        int k=sc.nextInt();
        int ans=kth(k,arr);
        System.out.println("Kth smallest number is "+ans);
    }
}
