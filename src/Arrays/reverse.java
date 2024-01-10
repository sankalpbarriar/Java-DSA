package Arrays;

public class reverse {
    static int[] reverseArray(int []arr){
        int j=0;
        int n=arr.length;
        int []ans=new int[n];
        for (int i=n-1;i>=0;i--){    //traverse original array in reverse direction
            ans[j++]=arr[i];

        }
        return ans;
    }
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] ans=reverseArray(arr);
        printArray(ans);
    }
}
