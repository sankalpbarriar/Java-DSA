package Recursion;

public class subsetSum {

    static void subsetSum(int[]a, int n, int idx, int sum){
        if (idx >= n){
            System.out.println(sum);
            return;
        }
        subsetSum(a,n,idx+1,sum+a[idx]);  //include
        subsetSum(a,n,idx+1,sum);  //exclude
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        subsetSum(arr,arr.length,0,0);
    }
}
