package BitManipulation;

public class unsetRightMostBit {
    static int unsetRightMostbit(int n){
        return n & (n-1);
    }
    static  void printBits(int num){
        for(int i = 7 ; i>=0 ; i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }

    static void noOfSetBits(int n){
        int cnt = 0;
        while(n!=0){
            cnt++;
            n = unsetRightMostbit(n);
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        printBits(48);
        int res = unsetRightMostbit(48);
        printBits(res);
        noOfSetBits(48);
    }
}
