package BinarySearch;
// Find minimum element in rotated sorted array
public class minElement {
    static int minIdx(int[] arr){
        int n=arr.length;
        int st=0,end=n-1;
        int fo=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[n-1]){         //Present in the 1st sorted part of the array
                st=mid+1;
            } else if (arr[mid]<=mid) {           //already in second sorted part of the array
                fo=mid;
                end=mid-1;
            }
        }
        return fo;

    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3,4};
        System.out.println(minIdx(arr));
    }
}
