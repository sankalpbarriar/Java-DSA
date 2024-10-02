package BitManipulation;

public class printTwoUnique {
    static int[] onlyTwoUnique(int[] arr){
        int xor = 0;
        int[] res = new int[2];
        //finding xor of both the uniques
        for(int i =0;i<arr.length;i++) {
            xor ^= arr[i];
        }
        int mask = xor&(xor-1)^xor;
        for(int i =0;i<arr.length;i++) {
            if((arr[i]&(mask)) ==0){
                res[0]^= arr[i];
            }
            else{
                res[1]^=arr[i];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        int[] res = onlyTwoUnique(arr);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
