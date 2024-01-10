package Arrays;
import java.util.Scanner;
public class second {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>mx){                        // i=0   1>mx  mx=1
                mx=arr[i];                        // i=1   2>1   mx=2.....
            }
        }
        return mx;
    }
    static int secondMax(int[] arr){
        int mx=findMax(arr);

        for (int i=0;i<arr.length;i++){
            if (arr[i]==mx){                  // Sare  max ko -inf assign kar do
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
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
        System.out.println("the largest element is "+findMax(arr));
        System.out.println("the second largest element is "+secondMax(arr));
    }
}
