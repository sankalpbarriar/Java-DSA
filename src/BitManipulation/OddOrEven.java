package BitManipulation;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int res = num & 1;
        if(res != 0) System.out.printf("The number %d is ODD!",num);
        else System.out.printf("The number %d is EVEN!",num);
    }
}
