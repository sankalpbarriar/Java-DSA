package BinarySearch;

public class SquareRoot {
    static int sqrt(int x){
        //Defining boundaries
        int st=0,end=x;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;      //we can use long here to avoid overflow
            if (val==x){
                return mid;
            } else if (val<x) {
                st=mid+1;
                ans=mid;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=49;
        System.out.println(sqrt(x));
    }
}
