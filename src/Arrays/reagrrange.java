package Arrays;
import java.util.Scanner;
public class reagrrange {
    static void negative(int[]arr,int n){
        int []a=new int[n];
        //for loop for storing positive numbers
        int j=0;
        for (int i=0;i<n;i++) {
            if (arr[i] > 0) {
                a[j++] = arr[i];
            }
        }
        //for loop for storing negative numbers
        for (int i=0;i<n;i++){
            if(arr[i]<0){
                a[j++]=arr[i];
            }
        }
        // transfering elements of array a to arr
        for (int i=0;i<n;i++){
            arr[i]=a[i];
        }
        //printing array
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        negative(arr,n);
    }
}
