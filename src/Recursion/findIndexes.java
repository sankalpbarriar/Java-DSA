package Recursion;

public class findIndexes {
    static void finAllIndices(int[] arr, int n, int target, int idx){
        if(idx>=n) return ;

        //SELF WORK
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        //RECURSIVE WORK
        finAllIndices(arr,n,target,idx+1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,2,3,5,6};
        int n=arr.length;
        int target=2;
        finAllIndices(arr,n,target,0);
    }
}
