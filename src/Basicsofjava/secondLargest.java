package Basicsofjava;

public class secondLargest {
    static int secLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;  // Update secondMax before changing max
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }   //this is to ensure the arr[i] is less than max but greater than secMax
                // We only update secondMax when the element is both greater than the current secondMax and distinct from the largest element.

        }
        return secondMax;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,2,6,4};
        int res = secLargest(arr);
        System.out.println(res);
    }
}
