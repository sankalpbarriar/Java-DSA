package BinarySearch;

public class raceTrack {

    static boolean isPossible(int[] arr, int k, int dist){
        int kidsPlaced=1;
        int lastKid=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]-lastKid >=dist){
                kidsPlaced++;
                lastKid=arr[i];
            }
        }
        return kidsPlaced>=k;
    }
    static int MaximalMini(int[] arr,int k){
        if (k> arr.length) return -1;
        int st=0,end=(int)1e9;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;// can K kids be placed such that no two kids have distance lesser than mid
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        int k=3;
        System.out.println(MaximalMini(arr,k));
    }
}
