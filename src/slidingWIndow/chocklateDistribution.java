package slidingWIndow;

import java.util.ArrayList;
import java.util.Arrays;

public class chocklateDistribution {
    static int findMinDiff(int[] a,int n,int m){
        int res=Integer.MAX_VALUE;
        Arrays.sort(a);
        //sliding window
        for(int i=0;i<n-m+1;i++){
            int minValue=a[i];
            int maxValue=a[i+m-1];
            res=Math.min(res,maxValue-minValue);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,7,9,9,12,56};
        int n=arr.length;
        int m=5;
        System.out.println(findMinDiff(arr,n,m));

    }
}
