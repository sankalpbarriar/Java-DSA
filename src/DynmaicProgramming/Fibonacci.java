package DynmaicProgramming;

public class Fibonacci {
    static int calls = 0;
    static int Fibo(int n,int[] dp){
        calls++;
        if(n == 0 || n == 1) return n;
        if(dp[n] != -1) return dp[n];   //in case of already calculated
        int result =  Fibo(n - 1,dp) + Fibo(n - 2,dp);
        dp[n] = result;   //storing result of each state
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        for(int i = 0 ; i < n + 1 ; i++){
            dp[i] = -1;
        }
        System.out.println(Fibo(n,dp));
        System.out.println("calls: " + calls);
    }
}
