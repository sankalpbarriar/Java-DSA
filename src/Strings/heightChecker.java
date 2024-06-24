package Strings;

public class heightChecker {
    static int[] CountSort(int[] arr){
        int[] count=new int[101];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int j=1;j<count.length;j++){
            if(count[j]!=0){
                while(count[j]>0){
                    arr[k++]=j;
                    count[j]--;
                }
            }

        }
        return count;
    }
    static int checkHeight(int[] arr){
        int[] copy=arr.clone();
        int cnt=0;
        CountSort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=copy[i]) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr={1,1,4,2,1,3};
        System.out.println(checkHeight(arr));
    }
}
