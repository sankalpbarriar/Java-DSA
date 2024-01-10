package Sorting;

public class insertionSort {
    static void insertSort(int[] a){
        int n=a.length;
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && a[j]<a[j-1]){
                //swap a[j] and a[j-1]
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;

            }
        }
    }
    public static void main(String[] args) {
        int[] a={4,5,2,6,4,7,5};
        insertSort(a);
        for(int val:a) {
            System.out.print(val+" ");



        }
    }
}
