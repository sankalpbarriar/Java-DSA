package AbstractDemo;

public class Binary{
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16};
        int target = 16;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Find the range while ensuring the end index is within array bounds
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            // Double the end value, but ensure it doesn't go beyond the array bounds
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Ensure that the end index is within array bounds
        end = Math.min(end, arr.length - 1);

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; // Target not found
    }


}