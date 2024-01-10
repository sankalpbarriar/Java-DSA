package Arrays;
import java.util.Scanner;
public class targetSum {
    static int target(int[]arr , int t){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    count+=1;
                }
            }

        }
        return count;



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
        int ans=target(arr,k);
        System.out.println(ans);
    }
}
