package Recursion;
import java.util.Scanner;
public class countOfDigit {
    static int findCount(int n) {

        if (n >= 0 && n <= 9) {      //BASE CASE
            return 1;
        }
        return findCount(n / 10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(findCount(n));
    }
}
