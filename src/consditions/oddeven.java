package consditions;


import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("the entered number is an even number");

        }
        else System.out.println("Odd number");


    }
}
