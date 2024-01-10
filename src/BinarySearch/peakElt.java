package BinarySearch;

public class peakElt {
    static int findPeakElt(int []arr){
        int st=0,end=arr.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){   //Agar mid hi peak element ho to
                ans=mid;
            }
            //If mid is on uphill
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }
            else end=mid-1;


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(findPeakElt(arr));
    }
}
