package array2D;
import java.util.Scanner;

public class transpose {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r, c;
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter the columns:");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        int[][] ans = new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
//        printArray(arr);
        printArray(ans);



    }
}
