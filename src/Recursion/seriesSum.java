package Recursion;
import java.util.Scanner;
                              // ALTERNATE SUM METHOD   f(5)=1-2+3-4+5
public class seriesSum {
    static int alternateSum(int n){
        if(n==0)
            return 0;
        if(n%2==0){        //even case
            return alternateSum(n-1)-n;
        }
        else                 //odd case
            return alternateSum(n-1)+n;

    }
    static int seriesSum1(int n){
        if(n==0) {
            return 0;
        }
        else{
            return seriesSum1(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
//        System.out.println(seriesSum1(n));
        System.out.println(alternateSum(n));
    }
}
