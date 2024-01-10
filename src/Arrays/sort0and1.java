package Arrays;
import java.util.Scanner;
public class sort0and1 {
    static int[] sorting(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        // 0 to count-1=0   & count-1 to n=1
        for (int i=0;i<arr.length;i++){
            if(i<count)
                arr[i]=0;
            else arr[i]=1;

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
        arr=sorting(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
