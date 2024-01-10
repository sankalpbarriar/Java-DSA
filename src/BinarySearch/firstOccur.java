package BinarySearch;

public class firstOccur {
    static int firstOccurence(int[] arr, int key) {
        int st = 0, end = arr.length - 1;
        int fo = -1;
        while (st <= end) {
            int mid=st+(end-st)/2;
            if (arr[mid] == key) {
                fo = mid;
                end = mid - 1;   //shifting the search space towards left  for ls=st=mid+1
            } else if (key < arr[mid]) {
                end = mid - 1;

            } else {
                st = mid + 1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 6, 2, 4};
        int x = 5;
        System.out.println(firstOccurence(arr, x));

    }
}

