package Sorting;

public class selectionSort {
    static void selectSort(int[] arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){  // i represent the current index
            //Find minimum element in unsorted part of array
            int min_idx=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            //swap current element ans minimum element
            //a[min-idx] & a[i]
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }


    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};
        selectSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
