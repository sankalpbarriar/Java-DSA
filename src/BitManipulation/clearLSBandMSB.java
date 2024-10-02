package BitManipulation;

public class clearLSBandMSB {
    static  void printBits(int num){
        for(int i = 7 ; i>=0 ; i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }
    static int clearLSB(int num, int bit){
        return num & ~((1<<bit+1)-1);
    }
    static int clearMSB(int num, int bit){
        return num & (1<<bit)-1;
    }
    static int clearMSBExclusive(int num, int bit){
        return num & ((1<<bit+1)-1);
    }

    public static void main(String[] args) {
        printBits(53);   //00110101
        int res1 = clearLSB(53,4);
        printBits(res1);   //00100000
        int res2 = clearMSB(53,4);
        printBits(res2);   //00000101
        int res3 = clearMSBExclusive(53,4);
        printBits(res3);   //00010101
    }
}
