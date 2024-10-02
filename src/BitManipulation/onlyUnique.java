package BitManipulation;

public class onlyUnique {
    static void onlyUnique(int[] arr){
        int res = 0;
        for(int i = 0;i<arr.length;i++){
           res = res^arr[i];
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,4,4,5,5,6,7,6,7};
        onlyUnique(arr);
    }
}
