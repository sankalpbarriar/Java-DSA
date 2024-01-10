package Recursion;
import java.util.Scanner;
public class sumOfDigits {
//    static int findSum(int n) {    //TC O(q)
//
//        if (n >= 0 && n <= 9) {      //BASE CASE
//            return n;
//        }
//        return findSum(n / 10) + n % 10;
//    }
   static int pow(int p, int q){
       if(q==0) return 1;

       int smallPow= pow(p,q/2);
       if(q%2==0){    //even
           return smallPow*smallPow;
       }
       else{
           return smallPow*smallPow*p;
       }
   }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter p:");
        int p=sc.nextInt();
        System.out.println("Enter q:");
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
