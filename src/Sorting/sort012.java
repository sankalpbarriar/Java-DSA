package Sorting;

import javax.swing.*;

public class sort012 {
    static void sort_012(int[] arr) {
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int i : arr) {
            if (arr[i] == 0) {
                count_0++;
            } else if (arr[i] == 1) {
                count_1++;
            } else if (arr[i] == 2) {
                count_2++;
            }
        }
        int k=0;
        while(count_0>0){
            arr[k++]=0;
            count_0--;
        }
        while(count_1>0){
            arr[k++]=1;
            count_1--;
        }
        while(count_2>0){
            arr[k++]=2;
            count_2--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,2,2,1,0,0,1};
        sort_012(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }
    }

}
