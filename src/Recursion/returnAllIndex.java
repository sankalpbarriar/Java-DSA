package Recursion;


import java.util.ArrayList;

public class returnAllIndex {
    static ArrayList<Integer> allIndices(int[] a, int n, int target, int idx){
        ArrayList<Integer> ans= new ArrayList<>();
        //BASE CASE
        if(idx>=n){
            return ans;
        }
        //SELF WORK
        if(a[idx]==target){
            ans.add(idx);
        }
        //RECURSIVE WORK
        ArrayList<Integer> smallAns=allIndices(a,n,target,idx+1);

        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,4,5,4};
        int target=4;
        int n=a.length;
        ArrayList<Integer>ans=allIndices(a,n,target,0);
        for (Integer i:ans){
            System.out.println(i);
        }
    }
}
