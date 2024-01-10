package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class secondLargest {
    static int second(int[]arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of elements:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of Array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("SECOND LARGEST:"+second(arr));
        }
    }

