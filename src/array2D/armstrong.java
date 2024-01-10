package array2D;
import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n; // Store the original number
        int digit = 0;

        // Calculate the number of digits
        while (n > 0) {
            n /= 10;
            digit++;
        }

        int sum = 0;
        n = originalNumber; // Reset n to the original number

        // Calculate the sum of cubes of digits
        while (n > 0) {
            int last = n % 10;
            sum += (Math.pow(last, digit));
            n = n / 10;
        }

        // Check if it's an Armstrong number
        if (originalNumber == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}
