package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class fst {
    static void threeMax(int[] arr){
        int fmax=Integer.MIN_VALUE;
        int scmax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>fmax){
                scmax=fmax;
                fmax=arr[i];

            }


        }
        System.out.println("MAXIMUM NUMBERS ARE "+fmax+","+scmax);


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
        threeMax(arr);
    }
}
