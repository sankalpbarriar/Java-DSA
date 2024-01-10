package array2D;
import java.util.Scanner;
public class SpiralMatrix {
    static void printSpiralMatrix(int[][] arr, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {
            //topRow-> leftCol to rightCol

            for (int i = leftCol; i <= rightCol && totalElements<r*c; i++) {
                System.out.print(arr[topRow][i]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol-> topRow to bottomRow

            for (int i = topRow; i <= bottomRow && totalElements<r*c; i++) {
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //bottomRow->rightCol to leftCol

            for (int i=rightCol;i>=leftCol && totalElements<r*c;i--){
                System.out.print(arr[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol->bottomRow to topRow

            for (int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

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
        printSpiralMatrix(arr2,r,c);

    }
}
