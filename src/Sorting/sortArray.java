package Sorting;

public class sortArray {
    static void disp(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }

    static void SortIt(int[] num){
        int n=num.length;
        int x=-1,y=-1;
        if(n<=1)  //handling corner cases
            return;
        //process all the adjacent elements
        for (int i=1;i<n;i++) {
            if (num[i - 1] > num[i]) {   //we are seeing a conflict
                if (x == -1) {  //first conflict
                    x = i - 1;
                    y = i;
                } else {  //2nd conflict
                    y = i;
                }
            }
        }
            //swap x,y in nums array
            int temp = num[x];
            num[x] = num[y];
            num[y] = temp;
        }




    public static void main(String[] args) {
        int[] arr={10,5,6,7,8,9,3};
        SortIt(arr);
        disp(arr);
    }
}
