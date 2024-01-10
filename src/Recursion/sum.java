package Recursion;

public class sum {
    static int sums(int n){
        if (n==1){
            return 1;
        }
        else
            return n+sums(n-1);
    }

    public static void main(String[] args) {
        System.out.println("sum is "+sums(50));
    }
}
