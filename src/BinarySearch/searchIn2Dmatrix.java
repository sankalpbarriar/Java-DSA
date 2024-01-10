package BinarySearch;

public class searchIn2Dmatrix {
    static boolean findNum(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int st=0,end=n*m-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            int midElt=arr[mid/m][mid%m];   //translating mid into indexes of 2D matrix i.e r=mid/m, c=mid%m
            if (target==midElt) return true;
            else if (target<midElt) end=mid-1;
            else st=mid+1;
            }
        return false;

    }
    public static void main(String[] args) {
        int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=199;
        System.out.println(findNum(arr,target));
    }
}
