package array2D;
import java.util.Scanner;
public class trasnposeInPlace {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] matrix,int r ,int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int r, c;
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter the columns:");
        c = sc.nextInt();
        int[][] arr2 = new int[r][c];  //r*c
        System.out.println("enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        System.out.println("original array is:");
        printArray(arr2);
        transpose(arr2,r,c);
        System.out.println("Transposed matrix is:");
        printArray(arr2);
    }
}
