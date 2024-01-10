package array2D;
import java.util.Scanner;
public class roate90 {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void transpose(int[][] matrix,int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotateMatrix(int[][] arr,int n){
        //transpose
        transpose(arr,n);
        //reverse each row of transposed matrix
        for (int i=0;i<n;i++){
            reverse(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the rows & columns:");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] arr = new int[n][n];  //r*c
        System.out.println("enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("original array is:");
        printArray(arr);
        rotateMatrix(arr,n);
        System.out.println("Rotated matrix matrix is:");
        printArray(arr);
    }
}
