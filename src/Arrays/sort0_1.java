package Arrays;
import java.util.Scanner;
public class sort0_1 {
    static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sort(int[] arr,int n){
//        int start=0;
        int i=0,j=n-1;
        while(i<j){
            if((arr[i]==1||arr[i]==2)&&(arr[j]==0)){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==2&&arr[j]==1){
                swap(arr,i,j);
                i++;
                j--;
            }
            if (arr[i]==0)
                i++;
            if (arr[j]==2)
                j--;
        }
        return arr;
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
        arr=sort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
