package Arrays;
import java.util.Scanner;
public class sortSquare {
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[] ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>=Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
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
        int[]ans=sortSquare(arr);
        reverse(ans);
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
