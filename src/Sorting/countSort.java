package Sorting;

public class countSort {
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static void basicCountSort(int[] arr){  // 2 4 2 2
        int max=findMax(arr);//find the largest element of the Arr
        int[] count=new int[max+1];
        for(int i=0;i< arr.length;i++){
            /*
                0 0 2 0 1  count
                0 1 2 3 4
            */
            count[arr[i]]++;
        }
        //traverse through count arr and overwrite the main array
        int k=0;
        for (int i=0;i< count.length;i++){   // 0 2 0 3 1 2
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void display(int[] a){
        for (int val:a) {
            System.out.print(val+" ");
        }
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int [] output=new int[n];
        int max = findMax(arr);//find the largest element of the Arr
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {  //make frequency array
            count[arr[i]]++;    //TC=> n
        }
        //make prefix sum of freq array
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];   //TC=> max
        }

        //Find the index of each element in the original array and put it in output array
        for (int i=n-1;i>=0;i--){     //TC=> n
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // Copy all element of output to array
        for (int i=0;i<n;i++){      //TC=> n
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int[]arr={1,4,5,2,2,5,6,7,4,9};
//        basicCountSort(arr);
        countSort(arr);
        display(arr);
    }
}
