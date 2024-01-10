package Sorting;

public class quickSort {
    static void displayArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int x,int y){   //passed array and indices
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot=arr[st];
        int cnt=0;

        for (int i=st+1;i<=end;i++){
            if (arr[i]<=pivot)  cnt++;
        }
        int pivotIdx=st+cnt;
        swap(arr,st,pivotIdx);
        int i=st,j=end;

        // elements lesser or equal left of pivot ,greater-> right side of pivot
        while (i<pivotIdx && j>pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {   // kahi hum pivot idx tak pahuch to nahi gyr
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickly(int[] arr, int st, int end){
        if(st>=end) return;

        int pi=partition(arr,st,end);
        quickly(arr,st,pi-1);
        quickly(arr,pi+1,end);

    }

    public static void main(String[] args) {
        int[] arr={6,6,7,3,1,5,4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickly(arr,0,arr.length-1);

        System.out.println("Array after sorting");  // 1 3 4 5 6
        displayArr(arr);
    }
}
