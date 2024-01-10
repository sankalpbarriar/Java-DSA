package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class smailestAndLArgest {
    static int[] smallestAndLArgestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
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
        int[]ans=smallestAndLArgestElement(arr);
        System.out.println("SMALLEST "+ ans[0]);
        System.out.println("LARGEST "+ ans[1]);
    }
}
