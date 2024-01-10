package BinarySearch;

public class Recursive {
    static boolean findNum(int []arr,int key ,int st , int end){
        //BASE CASE
        if(st>end)  return false;
        int mid=st+(end-st)/2;
        if(arr[mid]==key) return true;
        else if (key>arr[mid]) {
            return findNum(arr,key,mid+1,end);      //Sub prob
        }
        else {
            return findNum(arr, key, st, mid - 1);    //Sub prob
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,10};
        int target=0;
        while (target!=10){
            System.out.printf("%d is present in the arrray: %b\n ",target,findNum(arr,target,0,arr.length-1));
            target++;
        }

    }
}
