package BinarySearch;

public class SearchIn2DII {
    static boolean searchMatrix(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;  //stating our traversal

        while(i<n && j>=0){
            if (arr[i][j]==target) return true;

            if(target <arr[i][i]){
                j--;   //move left
            } else {
                i++;  //move downwards
            }
        }
        return false;

    }
    public static void main(String[] args) {

        int [][]arr={{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int target=14;
        System.out.println(searchMatrix(arr,target));
    }
}
