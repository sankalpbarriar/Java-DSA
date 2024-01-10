// Prefix sum over row & column
package array2D;
import java.util.Scanner;
public class prefixSum3 {

    //Calculate row wise and column wise sum
    // matrix[i][j]=sumRectangle((0,0)->(i,j))
    static void findPrefixSum(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally to calculate row-wise prefix sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        //traverse vertically to calculate column-wise prefix sum
        for (int j=0;j<c;j++){  //fixing column
            for (int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans=0,sum=0,up=0,left=0,leftUp=0;
        findPrefixSum(matrix);

        sum=matrix[l2][r2];
        if(r1>=1)
            left=matrix[l2][r1-1];
        if(l1>=1)
            up=matrix[l2-1][r2];
        if(l1>=1 && r1>=1)
            leftUp=matrix[l1-1][r1-1];

        ans=sum-up-left+leftUp;
        return ans;
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
        System.out.println("SUM IS: "+findSum3(arr2,l1,r1,l2,r2));
    }

}
