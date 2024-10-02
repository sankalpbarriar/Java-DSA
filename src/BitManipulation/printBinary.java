package BitManipulation;

public class printBinary {

    static int toggleIthBit(int num, int i){
        return num ^ (1<<i);
    }

    static int unsetIthBit(int num, int i){
        return num & ~(1<<i);
    }
    static  void printBits(int num){
        for(int i = 7 ; i>=0 ; i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }
    static boolean isPowerOf2(int n){
        if((n & n-1) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        printBits(45);
//        int res = toggleIthBit(45,4);
//        printBits(res);
        int res = unsetIthBit(45,3);
        printBits(res);
        System.out.println(isPowerOf2(33));
    }
}
