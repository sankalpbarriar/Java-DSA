package Sorting;

public class DNS {
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Dns(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
            low++;
            mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,0,0,2,1,2,0,1};
        Dns(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }

    }
}
