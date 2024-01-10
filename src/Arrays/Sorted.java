package Arrays;
import java.util.Scanner;
public class Sorted {

    static boolean isSorted(int[] arr) {
        boolean check = true;
        /*

        i=0;  arr[0]<arr[-1]  out of bound error

        */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }

        }
        return check;
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
        System.out.println("IS SORTED: " + isSorted(arr));

    }
}
