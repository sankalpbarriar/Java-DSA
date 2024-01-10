package Sorting;

public class count2 {
    static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void countSort(int[] arr){
        int mx=findmax(arr);
        int[] count=new int[mx+1];
        for (int i=0;i<arr.length;i++)
            count[arr[i]]++;
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,6,23,2};

        countSort(arr);
        display(arr);
    }
}
