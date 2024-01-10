package Arrays;
import java.util.Scanner;
public class repeat {


    static int firstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {       //first number
            for (int j = i + 1; j < arr.length; j++) {    //second number
                if (arr[i] == arr[j]) return arr[i];

            }

        }
        return-1;


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
        System.out.println("THE REPEATING NUMBER IS "+firstRepeatingNumber(arr));
    }
}
