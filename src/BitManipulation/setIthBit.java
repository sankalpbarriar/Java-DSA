package BitManipulation;

public class setIthBit {
    static  void printBits(int num){
        for(int i = 7 ; i>=0 ; i--){
            System.out.print((num>>i)&1);
        }
    }

    static void setBit(int num , int i){
        printBits(num);
        System.out.println();
        num = num | (1<<i);
        printBits(num);
    }
    static boolean checkKthBit(int n, int k) {
        int bit = n&(1<<k);
        return bit==0?false:true;
    }

    public static void main(String[] args) {
//        setBit(35,6);
        System.out.println(checkKthBit(4,2));
    }
}
