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
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,2,5,6,3};
        int res = secLargest(arr);
        System.out.println(res);
    }
}
