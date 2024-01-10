package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class cloneM2 {
    static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        System.out.println("Enter no. of elements:");
        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
        int n=5;
        int arr[]=new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("enter arr "+ i);
//            arr[i]=sc.nextInt();
//        }

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        System.out.println("Original array:");
        printArray(arr);
        System.out.println("Copied array:");
        int []arr_2=Arrays.copyOf(arr,arr.length);
        printArray(arr_2);       //changing some values of arr_2
        arr_2[0]=66;
        arr_2[1]=67;
        System.out.println("Original array after changing:");
        printArray(arr);
        System.out.println("copied array after changing some vcalues:");
        printArray(arr_2);


    }
}
