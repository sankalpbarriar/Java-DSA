package Sorting;

public class bubbleSort {
    static void bubSort(int[] a){
        int n=a.length;
        //n-1 passes/iterations

        for (int i=0;i<n;i++){
            boolean flag=false;  //checks for any swapping

            //lase i elements are already at correct sorted positions,
            //so no need to sort them
            for (int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]){
                    //swap--> arr[j] & arr[j+1]
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;         //some swap happened
                }
            }
            if (!flag)   //if flag==false    is any swap happen ? if NOT return
                return;
        }
    }
    public static void main(String[] args) {
        int[] a={9,4,7,8,3};
        bubSort(a);
        for (int i:a) {
            System.out.print(i+" ");
        }
        }

    }

