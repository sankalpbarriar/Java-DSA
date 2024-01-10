package array2D;
import java.util.Scanner;
public class upperHalf {
    static void printUpper(int[][] arr,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(arr[i][j] );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter the elements of the Array:");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printUpper(arr,n);
    }
}
