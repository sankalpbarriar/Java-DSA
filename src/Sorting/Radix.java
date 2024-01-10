package Sorting;

public class Radix {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    static void basicCountSort(int[] arr) {  // 2 4 2 2
        int max = findMax(arr);//find the largest element of the Arr
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            /*
                0 0 2 0 1  count
                0 1 2 3 4
            */
            count[arr[i]]++;
        }
        //traverse through count arr and overwrite the main array
        int k = 0;
        for (int i = 0; i < count.length; i++) {   // 0 2 0 3 1 2
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    static void countSort(int[] arr,int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {  //make frequency array ,arr[i]=105 ferq[5]++, place=1
            count[(arr[i]/place)%10]++;
        }
        //make prefix sum of freq array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        //Find the index of each element in the original array and put it in output array
        for (int i = n-1; i >= 0; i--) {
            int idx=count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // Copy all element of output to array
        for (int i = 0; i < n; i++) {      //TC=> n
            arr[i] = output[i];
        }
    }
    static void radixSort(int[]arr){
        int max=findMax(arr);   //get the maximum value
        //Apply count sort to sort the element based on place value
        for (int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int[] arr={170,45,90,802,2};
        radixSort(arr);
        display(arr);
    }
}
