package array2D;
import java.util.Scanner;
public class PrefixSum {
    static int sum(int[][]arr, int l1,int r1, int l2, int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
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
        System.out.println("Enter the boundaries of rectangle:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("SUM IS: "+sum(arr2,l1,r1,l2,r2));
    }
}
