package Recursion;
import java.util.Scanner;
public class longDivForGCD {
    static int iGCD(int x,int y){
        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    //GCD using RECURSION (Euclid's Algorithm)
    static int GCD(int x, int y){
        if(y==0) return x;
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y=sc.nextInt();
        System.out.println("The HCF is: "+iGCD(x,y));
        System.out.println("The HCF is: "+GCD(x,y));
    }

}
