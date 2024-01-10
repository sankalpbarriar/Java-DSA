package Recursion;
import java.util.Scanner;
public class GCD {                    //BRUTE FORCE APPROACH
    static int findHCF(int x ,int y) {
        int smaller;
        if (x < y) {
            smaller = x;
        } else smaller = y;
        for (int i = smaller; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println("Enter y: ");
        int y=sc.nextInt();
        System.out.println(findHCF(x,y));
    }
}
