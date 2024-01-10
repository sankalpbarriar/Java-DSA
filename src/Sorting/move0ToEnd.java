package Sorting;

public class move0ToEnd {
    static void moveAllOtoEnd(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                if (a[j]==0 && a[j+1]!=0){
                    // swap them
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) return;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,0,3,0,8,2,0,0,8,5};
        moveAllOtoEnd(arr);
        for (int val:
             arr) {
            System.out.print(val+" ");
        }
    }
}
