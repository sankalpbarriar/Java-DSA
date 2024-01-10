package Recursion;

public class RecursionOnArray {
    static void printArray(int[] arr,int idx){
        if(idx==arr.length)                //BASE CASE   idx=4
            return;

        System.out.print(arr[idx]+" ");         //SELF WORK  print->5
        printArray(arr,idx+1);            //RECURSIVE WORK-> [6,7,8]
    }
    public static void main(String[] args) {
        int [] arr={5,6,7,8};
        printArray(arr,0);
    }
}
