package array2D;

import javax.swing.*;
import java.util.Scanner;

public class add {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] a, int[][] b, int r1, int r2, int c1, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("wrong input addition no possible:");
            return;
        }
        int[][]sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }

    public static void main(String[] args) {
        int r1, c1,r2,c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of array a:");
        r1 = sc.nextInt();
        System.out.println("Enter the columns of array a:");
        c1 = sc.nextInt();
        System.out.println("Enter the rows of array b:");
        r2 = sc.nextInt();
        System.out.println("Enter the columns of array b:");
        c2 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];  //r*c
        System.out.println("enter the elements of the array 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }

        }
        int[][] arr2=new int[r2][c2];
        System.out.println("enter the elements of the array 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }

        } 
        add(arr1,arr2,r1,r2,c1,c2);
    }
}
