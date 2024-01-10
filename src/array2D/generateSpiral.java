package array2D;
import java.util.Scanner;
public class generateSpiral {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] printSpiral(int n) {
        int[][] arr = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;

        while (current <= n * n) {
            for (int i = leftCol; i <= rightCol && current <= n * n; i++) {
                arr[topRow][i] = current++;
            }
            topRow++;

            //rightCol-> topRow to bottomRow

            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                arr[i][rightCol] = current++;
            }
            rightCol--;

            //bottomRow->rightCol to leftCol

            for (int i = rightCol; i >= leftCol && current <= n * n; i--) {
                arr[bottomRow][i] = current++;
            }
            bottomRow--;

            //leftCol->bottomRow to topRow

            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                arr[i][leftCol] = current++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[][] matrix=printSpiral(n);
        printMatrix(matrix);
    }
}
