package Recursion;
import java.util.Scanner;
public class sumElements {
    static int eleSum(int[] arr,int idx){
        if(idx==arr.length)
            return 0;             //BASE CASE==> agar empty array hai to return 0

        int smallAns=eleSum(arr,idx+1);      //RECURSIVE WORK
        return smallAns+arr[idx];                //SELF WORK
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        System.out.println(eleSum(arr,0));
    }
}
